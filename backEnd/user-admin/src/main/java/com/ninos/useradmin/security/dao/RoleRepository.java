package com.ninos.useradmin.security.dao;

import com.ninos.useradmin.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}

