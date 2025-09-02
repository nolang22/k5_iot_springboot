package com.example.k5_iot_springboot.dto.I_order.request;

public class StockRequest {
    /* 제고 증가/감소 요청 DTO */
    public record StockAdjust(
            Long productId,
            int delta       // 텔타 - 변화량
    ) {}

    /* 제고 직접 설정 요청 DTO */
    public record StockSet(
            Long productId,
            int quantity
    ) {}
}
