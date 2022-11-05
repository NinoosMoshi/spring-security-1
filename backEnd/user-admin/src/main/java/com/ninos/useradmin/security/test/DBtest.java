package com.ninos.useradmin.security.test;

import com.ninos.useradmin.security.dao.RoleRepository;
import com.ninos.useradmin.security.dao.UserRepository;
import com.ninos.useradmin.security.model.Role;
import com.ninos.useradmin.security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBtest  {  //implements CommandLineRunner

//    private UserRepository userRepository;
//    private RoleRepository roleRepository;
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public DBtest(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.passwordEncoder = passwordEncoder;
//    }

//    @Override
//    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setEmail("ninos@gmail.com");
//        user.setPassword(passwordEncoder.encode("12345"));
//        user.setActive(1);
//        List<Role> authorities = roleRepository.findAll();
//        user.getRoles().add(authorities.get(0));
//        userRepository.save(user);
//    }

//    @Override
//    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setEmail("nahrain@gmail.com");
//        user.setPassword(passwordEncoder.encode("22222"));
//        user.setActive(1);
//        List<Role> authorities = roleRepository.findAll();
//        user.getRoles().add(authorities.get(0));
//        user.getRoles().add(authorities.get(1));
//        userRepository.save(user);
//
//    }



}

