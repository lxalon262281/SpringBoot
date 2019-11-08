package com.lx.jpaTest.dao;

import com.lx.jpaTest.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface PersonTestRepository extends JpaRepository<Person,Long>{
    public Person getByName(String name);
}
