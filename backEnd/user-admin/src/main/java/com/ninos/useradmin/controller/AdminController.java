package com.ninos.useradmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {


    @RequestMapping("/find-admin")
    public String getAdmin(){return "this is admin";}


}
