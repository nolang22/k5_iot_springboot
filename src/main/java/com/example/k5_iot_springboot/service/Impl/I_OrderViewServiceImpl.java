package com.example.k5_iot_springboot.service.Impl;

import com.example.k5_iot_springboot.repository.I_OrderViewRepository;
import com.example.k5_iot_springboot.service.I_OrderViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class I_OrderViewServiceImpl implements I_OrderViewService {

    private final I_OrderViewRepository orderViewRepository;

}
