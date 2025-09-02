package com.example.k5_iot_springboot.dto.I_order.response;

public class ProductResponse {
    /* 제품 응답 DTO */
    public record DetailResponse(
            Long id,
            String name,
            Integer price
    ) {}

    /* 제품 요약 응답 DTO */
    public record ListResponse() {}
}
