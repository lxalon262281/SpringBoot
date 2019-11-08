package com.lx.service;

import com.lx.dao.UserDao;
import com.lx.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by yangyibo on 17/1/18.
 */
@Service
public class CustomUserService implements UserDetailsService { //自定义UserDetailsService 接口

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userDao.findByUserName(username);
        if (user != null) {
            UserDetails	user1 = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), true, true, true, true,
                    getAuthorities(1));
            return user1;

        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }

    /**
     * 获得访问角色权限
     */
    public Collection<GrantedAuthority> getAuthorities(Integer access) {

        Collection<GrantedAuthority> authorities = new ArrayList<>();

        //所有的用户默认拥有ROLE_USER权限
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        if (access.compareTo(0) == 0) {
            // 如果参数access为0.则拥有ROLE_ADMIN权限
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }else if(access.compareTo(2) == 0) {
            // 如果参数access为2.则拥有ROLE_TAO权限
            authorities.add(new SimpleGrantedAuthority("ROLE_TAO"));
        }

        //最终这里返回的是用户权限集合
        return authorities;
    }

}



