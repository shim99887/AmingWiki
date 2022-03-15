package com.thirautech.amingwiki.service;

import com.thirautech.amingwiki.dto.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> findAllUserInfo();
}
