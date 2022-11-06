package com.ninos.useradmin.controller;

import com.ninos.useradmin.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private final PersonService personService;


//    @PreAuthorize("hasAuthority('user')")
//    @RequestMapping("/find-person-user")
//    public String getPersonUser(){
//        return personService.getPersonUser();
//    }
//
//
//    @PreAuthorize("hasAuthority('admin')")
//    @RequestMapping("/find-person-admin")
//    public String getPersonAdmin(){
//        return personService.getPersonAdmin();
//    }


    @PreAuthorize("hasAuthority('user')")
    @RequestMapping("/find-person-user")
    public String getPersonUser(){
        return "this is user hi";
    }


    @PreAuthorize("hasAuthority('admin')")
    @RequestMapping("/find-person-admin")
    public String getPersonAdmin(){
        return "this is admin hi";
    }




}
