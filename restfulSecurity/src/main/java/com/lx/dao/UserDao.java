package com.lx.dao;


import com.lx.domain.User;

public interface UserDao {
    public User findByUserName(String username);
}
