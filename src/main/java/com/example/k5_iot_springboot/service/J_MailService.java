package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.mail.MailRequest;
import jakarta.validation.Valid;

public interface J_MailService {

    void sendEmail(MailRequest.@Valid SendMail req);
    void verifyEmail(String token);
}
