package com.lx.jpaTest.dao;

import com.lx.jpaTest.entity.DbUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbUserRepository extends JpaRepository<DbUser,Integer> {

    public DbUser findByUsername(String username);
}
