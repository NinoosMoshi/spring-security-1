package com.ninos.useradmin.service.impl;

import com.ninos.useradmin.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public String getPersonUser() {
        return "this is user";
    }


    @Override
    public String getPersonAdmin() {
        return "this is admin";
    }
}
