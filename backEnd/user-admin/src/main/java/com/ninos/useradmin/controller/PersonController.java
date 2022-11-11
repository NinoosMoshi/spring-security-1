package com.ninos.useradmin.controller;

import com.ninos.useradmin.entity.Person;
import com.ninos.useradmin.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private final PersonService personService;


    // @PreAuthorize("hasAuthority('one') and hasAuthority('two') and ...")
    @PreAuthorize("hasAuthority('user')")
    @GetMapping("/all")
    public List<Person> getAllPersons(){
        return personService.getPersons();
    }



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

//
//    @PreAuthorize("hasAuthority('user')")
//    @RequestMapping("/find-person-user")
//    public String getPersonUser(){
//        return "this is user hi";
//    }
//
//
//    @PreAuthorize("hasAuthority('admin')")
//    @RequestMapping("/find-person-admin")
//    public String getPersonAdmin(){
//        return "this is admin hi";
//    }




}
