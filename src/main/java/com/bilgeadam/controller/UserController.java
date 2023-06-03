package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.User;
import com.bilgeadam.service.UserService;

import java.util.List;

public class UserController {

    UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public User createUser(User user) {
        return  userService.save(user);
    }

    public List<User> findAll(){
        return  userService.findAll();
    }

}
