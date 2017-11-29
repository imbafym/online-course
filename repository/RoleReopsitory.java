package com.example.onlinecourse.repository;

import com.example.onlinecourse.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleReopsitory extends JpaRepository<Role, Integer> {

    Role findByRole(String role);

}
