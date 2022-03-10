package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    
    

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PostMapping("/adduserss")
    public List<User> addUsers(@RequestBody List<User> users) {
        return service.saveUsers(users);
    }

    @GetMapping("/users")
        public List<User> findUsersByNameAsc() {
        List<User> userlist= service.getUsers();
		Collections.sort(userlist, new UserNameComp());
		return userlist;
    }

    @GetMapping("/userById/{id}")
    public User findUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    /*@GetMapping("/userByName/{name}")
    public User findUserByName(@PathVariable String name) {
        return service.getUserByName(name);
    }*/
}

