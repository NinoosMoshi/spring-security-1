package com.ninos.useradmin.dao;

import com.ninos.useradmin.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
