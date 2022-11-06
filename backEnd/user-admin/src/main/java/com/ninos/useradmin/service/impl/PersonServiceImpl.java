package com.ninos.useradmin.service.impl;

import com.ninos.useradmin.dao.PersonRepository;
import com.ninos.useradmin.entity.Person;
import com.ninos.useradmin.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;


    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }
}
