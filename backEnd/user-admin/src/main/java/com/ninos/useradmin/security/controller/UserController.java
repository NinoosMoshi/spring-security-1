package com.ninos.useradmin.security.controller;

import com.ninos.useradmin.security.dto.JwtLogin;
import com.ninos.useradmin.security.dto.LoginResponse;
import com.ninos.useradmin.security.jwt.filter.JwtAuthenticationFilter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UserController {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody JwtLogin jwtLogin){
        return jwtAuthenticationFilter.login(jwtLogin);
    }

}
