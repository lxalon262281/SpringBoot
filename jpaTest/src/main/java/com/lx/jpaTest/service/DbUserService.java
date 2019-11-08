package com.lx.jpaTest.service;

import com.lx.jpaTest.dao.DbUserRepository;
import com.lx.jpaTest.dao.PersonTestRepository;
import com.lx.jpaTest.entity.DbUser;
import com.lx.jpaTest.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbUserService {
    @Autowired
    DbUserRepository dbUserRepository;

    public DbUser getPerson(String username) {
        DbUser user = dbUserRepository.findByUsername(username);
        return user;
    }
}
