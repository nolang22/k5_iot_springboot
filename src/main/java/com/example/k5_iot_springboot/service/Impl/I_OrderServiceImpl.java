package com.example.k5_iot_springboot.service.Impl;

import com.example.k5_iot_springboot.entity.I_Order;
import com.example.k5_iot_springboot.repository.I_OrderRepository;
import com.example.k5_iot_springboot.service.I_OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class I_OrderServiceImpl implements I_OrderService {

    private final I_OrderRepository repository;
}
