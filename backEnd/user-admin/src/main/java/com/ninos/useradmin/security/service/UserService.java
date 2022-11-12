package com.ninos.useradmin.security.service;

import com.ninos.useradmin.security.dao.UserRepository;
import com.ninos.useradmin.security.dto.UserPrincipal;
import com.ninos.useradmin.security.model.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(email);
        UserPrincipal userPrincipal = new UserPrincipal(user);
        return userPrincipal;
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public boolean ifEmailExists(String email){
        return userRepository.existsByEmail(email);
    }


}
