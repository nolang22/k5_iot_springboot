package com.example.k5_iot_springboot.repository;

import com.example.k5_iot_springboot.entity.I_OrderLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface I_OrderLogRepository extends JpaRepository<I_OrderLog, Long> {
}
