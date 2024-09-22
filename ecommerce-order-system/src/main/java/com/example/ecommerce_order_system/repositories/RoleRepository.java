package com.example.ecommerce_order_system.repositories;

import com.example.ecommerce_order_system.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
