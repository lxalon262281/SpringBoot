package com.lx.jpaTest.service;

import com.lx.jpaTest.dao.PersonTestRepository;
import com.lx.jpaTest.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonTestRepository personRepository;

    public Person getPerson(String username) {
        Person person = personRepository.getByName(username);
        return person;
    }
}
