package com.thirautech.amingwiki.dao;

import com.thirautech.amingwiki.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List<UserDto> findAllUserInfo();
    public UserDto findAllUserInfoById(String id);
}
