package com.example.k5_iot_springboot.security.util;


import com.example.k5_iot_springboot.entity.H_Article;
import com.example.k5_iot_springboot.repository.H_ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/*  cf) 역할 체크 VS 소유자 검사 및 리포지토리 접근 체크
    1. 역할 체크
        : @PreAuthorize("hasRole('ADMIN')") 만으로 충분!
    2. 소유자 검사(게시글 작성자만 수정/삭제 가능)
        ,리포지토리 접근이 필요한 조건(팀원 여부, 프로젝트 멤버십)이 있다면
        >> 컨트롤러/서비스에 비즈니스 로직을 섞지 않기 위해 빈(Bean)으로 분리 권장!
 */
@Component("Authz")
@RequiredArgsConstructor
public class AuthorizationChecker {
    private final H_ArticleRepository articleRepository;

    // principal(LoginId)이 해당 articledId의 작성자인지 검사 //
    public boolean isArticleAuthor(Long articleId, Authentication principal) {

        // 만약 프린서펄이 널이거나 아티클아이디가 널이라면 실패로 반환
        if (principal == null || articleId == null) return false;

        // 널이 아니라면 로그인 아이디에 프린서펄에 있는 이름을 넣는다.
        String loginId = principal.getName(); // JwtAuthenticationFilter 에서 username 으로 주입

        // H_Article 클래스로 아티클리포지토리에 있는 아티클 아이디를 찾아서 아티클에 넣는다. 없으면 널
        H_Article article = articleRepository.findById(articleId).orElse(null);

        // 만약 아티클이 널이라면 실패로 반환
        if (article == null) return false;

        // 아티클이 널이 아니라면 아우터, 로그인 아이디 일치여부를 확인 후 반환
        return article.getAuthor().getLoginId().equals(loginId);
        // loginId와 article의 작성자가 일치하면 true 반환, 아닐 경우 false 반환


    }

}
