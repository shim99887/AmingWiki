package com.thirautech.amingwiki.service;

import com.thirautech.amingwiki.dao.UserDao;
import com.thirautech.amingwiki.dto.UserDto;
import com.thirautech.amingwiki.security.SHA512PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginIdPwValidator implements UserDetailsService {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new SHA512PasswordEncoder();
    }

    @Autowired
    private UserDao dao;

    @Autowired
    private PasswordEncoder passwordEncode;

    @Override
    public UserDetails loadUserByUsername(String insertedId) throws UsernameNotFoundException {
        UserDto user = dao.findAllUserInfoById(insertedId);

        if (user == null) {
            return null;
        }

        System.out.println(passwordEncode.encode("admin"));

        String pw = user.getPassword(); //"d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db"
        String roles = user.getAuth(); //"USER"

        return User.builder()
                .username(insertedId)
                .password(pw)
                .roles(roles)
                .build();
    }
}
