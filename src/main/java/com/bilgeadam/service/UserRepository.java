package com.bilgeadam.service;

import com.bilgeadam.repository.entity.User;
import com.bilgeadam.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User,Long> {
    public UserRepository() {
        super(new User());
    }
}
