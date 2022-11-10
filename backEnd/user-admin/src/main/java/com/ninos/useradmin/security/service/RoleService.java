package com.ninos.useradmin.security.service;

import com.ninos.useradmin.security.dao.RoleRepository;
import com.ninos.useradmin.security.model.Role;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;



@AllArgsConstructor
@Service
public class RoleService {

    private final RoleRepository roleRepository;

    @Transactional(readOnly = true)
    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }



}
