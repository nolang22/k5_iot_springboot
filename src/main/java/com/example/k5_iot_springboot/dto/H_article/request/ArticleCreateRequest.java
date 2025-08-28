package com.example.k5_iot_springboot.dto.H_article.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ArticleCreateRequest(
        @NotBlank @Size(max = 200)
        String title,
        @NotBlank
        String content
) {}
