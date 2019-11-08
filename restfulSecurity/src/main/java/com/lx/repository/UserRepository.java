package com.lx.repository;


import com.lx.domain.User;

/**
 * 用户repository
 * @author 言曌
 * @date 2017/12/27 0027 20:50
 */
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    User findByUsername(String username);
}