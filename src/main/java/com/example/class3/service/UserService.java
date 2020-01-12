package com.example.class3.service;

/* put business logic here*/

import com.example.class3.model.User;
import com.example.class3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    // public String getUser(){
    public User getUser(){
        //UserRepository userRepository = new UserRepository();
        return userRepository.getUser();
    }
}
