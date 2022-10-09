package com.ninos.useradmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {


    @RequestMapping("/find-person")
    public String getPerson(){
        return "this is person";
    }

}
