package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userRepository.findById(id).get();
    }

    @GetMapping("/insertUser")
    public User insertUser(User user){
        return userRepository.save(user);
    }
}
