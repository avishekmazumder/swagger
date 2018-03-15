package com.tiaa.swaggerexample.restservice;

import com.tiaa.swaggerexample.dataacess.UserDaoService;
import com.tiaa.swaggerexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Avishek on 16-Mar-18.
 */
@RestController
public class UserController {

    @Autowired
    UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getOneUser(@PathVariable int id) {
        return userDaoService.findOne(id);
    }

}
