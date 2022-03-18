package com.thirautech.amingwiki.controller;

import com.thirautech.amingwiki.dto.UserDto;
import com.thirautech.amingwiki.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/{test}")
    public String login(@PathVariable String test){
        String encodePassword = passwordEncoder.encode(test);

        System.out.println(passwordEncoder.matches("test", encodePassword));

        return encodePassword;
    }

    @PostMapping("/login")
    public boolean loginTest(@RequestBody Map<String, String> map){
        UserDto user = service.findAllUserInfoById(map.get("id"));
//        System.out.println(user.getPassword());
//        System.out.println(passwordEncoder.encode(map.get("pw")));

//        System.out.println(passwordEncoder.encode(map.get("pw")).equals(user.getPassword()));

        return passwordEncoder.matches(map.get("pw"), user.getPassword());
    }

    @GetMapping("/getAuth")
    public Collection<GrantedAuthority> dashboard(@AuthenticationPrincipal User userInfo) throws Exception {

        return userInfo.getAuthorities();
    }
//    @GetMapping("/all")
//    public List<UserDto> getAllUserInfo(){
//        return service.findAllUserInfo();
//    }
}
