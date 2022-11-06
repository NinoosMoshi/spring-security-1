package com.ninos.useradmin.service;

import org.springframework.security.access.prepost.PreAuthorize;

public interface PersonService {

//    @PreAuthorize("hasAuthority('user')")
    String getPersonUser();

//    @PreAuthorize("hasAuthority('admin')")
    String getPersonAdmin();


}
