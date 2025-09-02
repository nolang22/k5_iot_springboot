package com.example.k5_iot_springboot.service.Impl;

import com.example.k5_iot_springboot.repository.I_OrderLogRepository;
import com.example.k5_iot_springboot.service.I_OrderLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class I_OrderLogServiceImpl implements I_OrderLogService {

    public final I_OrderLogRepository orderLogRepository;


}
