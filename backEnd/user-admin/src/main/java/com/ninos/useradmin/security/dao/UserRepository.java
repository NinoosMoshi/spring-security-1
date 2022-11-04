package com.ninos.useradmin.security.dao;

import com.ninos.useradmin.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

       User findUserByEmail(String email);

}
