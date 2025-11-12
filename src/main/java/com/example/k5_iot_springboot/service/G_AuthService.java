package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.G_auth.request.SignInRequest;
import com.example.k5_iot_springboot.dto.G_auth.request.SignUpRequest;
import com.example.k5_iot_springboot.dto.G_auth.response.SignInResponse;
import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.dto.mail.MailRequest;
import com.example.k5_iot_springboot.security.UserPrincipal;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

public interface G_AuthService {
    void signUp(@Valid SignUpRequest req);
    ResponseDto<SignInResponse> signIn(@Valid SignInRequest req, HttpServletResponse response);

    void resetPassword(MailRequest.@Valid PasswordReset req);

    String refreshAccessToken(String refreshToken);

    void deleteRefreshTokne(UserPrincipal userPrincipal);
}
