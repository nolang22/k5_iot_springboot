package com.example.k5_iot_springboot.dto.I_order.request;

public class ProductRequest {
    /* 제품 등록 요청 DTO */
    public record Create(
            String name,
            Integer price
    ) {}

    public record Update(
            String name,
            Integer price
    ) {}
}
