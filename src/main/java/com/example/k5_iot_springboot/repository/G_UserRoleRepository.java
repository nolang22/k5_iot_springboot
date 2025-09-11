package com.example.k5_iot_springboot.repository;

import com.example.k5_iot_springboot.entity.G_UserRole;
import com.example.k5_iot_springboot.entity.G_UserRoleId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface G_UserRoleRepository extends JpaRepository<G_UserRole, G_UserRoleId> {
    List<G_UserRole> findByUserId(Long userId);
}
