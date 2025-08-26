package com.example.k5_iot_springboot.dto.G_auth.request;

import com.example.k5_iot_springboot.common.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

// 회원 가입 요청 DTO
public record SignUpRequest(
        // 불변 객체
        @NotBlank @Size(min =4, max = 50)
        String loginId,

        @NotBlank @Size(min =8, max = 100)
        String password,

        @NotBlank @Size(max = 255)
        String email,

        @NotBlank @Size(max = 50)
        String nickname,

        // 선택 값(null 허용)
        Gender gender


) {
}
