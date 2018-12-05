package com.milan.web.controller;

import com.milan.web.Mapper.UserMapper;
import com.milan.web.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userMapper.getUserById(id);
    }

    @GetMapping("/user")
    public int addUser(User user){
        return userMapper.addUser(user);
    }
}
