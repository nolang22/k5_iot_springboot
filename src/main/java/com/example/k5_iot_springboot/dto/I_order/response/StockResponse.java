package com.example.k5_iot_springboot.dto.I_order.response;

public class StockResponse {
    /* 제고 응답 DTO */
    public record Response(
            Long productId,
            int quantity
    ) {}
}
