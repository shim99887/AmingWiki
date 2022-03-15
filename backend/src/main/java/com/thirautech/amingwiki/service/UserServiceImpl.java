package com.thirautech.amingwiki.service;

import com.thirautech.amingwiki.dao.UserDao;
import com.thirautech.amingwiki.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao dao;

    @Override
    public List<UserDto> findAllUserInfo() {
        return dao.findAllUserInfo();
    }
}
