package com.thirautech.amingwiki.controller;

import com.thirautech.amingwiki.dto.UserDto;
import com.thirautech.amingwiki.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{test}")
    public  String login(@PathVariable String test){
        return test;
    }

    @GetMapping("/all")
    public List<UserDto> getAllUserInfo(){
        return service.findAllUserInfo();
    }
}
