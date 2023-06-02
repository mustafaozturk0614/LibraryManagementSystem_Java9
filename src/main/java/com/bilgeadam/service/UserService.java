package com.bilgeadam.service;

import com.bilgeadam.repository.entity.User;
import com.bilgeadam.utility.MyFactoryService;

public class UserService  extends MyFactoryService <UserRepository, User,Long> {
    public UserService() {
        super(new UserRepository());
    }
}
