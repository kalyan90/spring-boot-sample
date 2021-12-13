package com.sandbox.userservice.controller;

import javax.websocket.server.PathParam;

import com.sandbox.userservice.entity.User;
import com.sandbox.userservice.service.UserService;
import com.sandbox.userservice.viewmodel.UserResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    final Logger logger = LoggerFactory.getLogger(UserController.class);
     
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable("id") Long userId){
        return userService.getUserWithDeparmentById(userId);
    }

}
