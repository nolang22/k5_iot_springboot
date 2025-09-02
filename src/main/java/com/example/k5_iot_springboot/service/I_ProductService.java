package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.I_order.request.ProductRequest;
import com.example.k5_iot_springboot.dto.I_order.response.ProductResponse;
import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.security.UserPrincipal;
import jakarta.validation.Valid;

public interface I_ProductService {

    ResponseDto<ProductResponse.DetailResponse> create(UserPrincipal userPrincipal, ProductRequest.@Valid Create req);
    ResponseDto<ProductResponse.DetailResponse> update(Long productId, UserPrincipal userPrincipal, ProductRequest.@Valid Update req);
    ResponseDto<ProductResponse.DetailResponse> get(Long productId);
}
