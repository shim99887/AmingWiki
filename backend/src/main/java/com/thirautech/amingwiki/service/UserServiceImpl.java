package com.thirautech.amingwiki.service;

import com.thirautech.amingwiki.dao.UserDao;
import com.thirautech.amingwiki.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required=false)
    private UserDao dao;

    @Override
    public List<UserDto> findAllUserInfo() {
        return dao.findAllUserInfo();
    }

    @Override
    public UserDto findAllUserInfoById(String id) {
        return dao.findAllUserInfoById(id);
    }

}
