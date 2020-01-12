package com.example.class3.repository;

/* database works*/

import com.example.class3.model.Address;
import com.example.class3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    /*
    public String getUser(){
        return "hello from repository";
    }
    * */


    public User getUser(){
        User user;
        Address address = new Address("Brisbane", "Australia");
        user = new User("iqbal", 12, address, "+6146");
        return user;
    }
}
