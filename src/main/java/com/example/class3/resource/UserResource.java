package com.example.class3.resource;

/* glue with front end*/

import com.example.class3.model.User;
import com.example.class3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    // public String getUser(){
    public User getUser(){
        /* UserService userService = new UserService(); */
        return userService.getUser();
        /*return "hello";*/
    }
}
