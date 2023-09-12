package com.example.nsshop.domain.user.dao;

import com.example.nsshop.domain.user.domain.ERole;
import com.example.nsshop.domain.user.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
