package com.lx.repository;

import com.lx.pojo.DbUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbUserRepository extends JpaRepository<DbUser,Integer> {

    public DbUser findByUsername(String username);
}
