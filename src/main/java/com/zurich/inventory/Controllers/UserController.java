package com.zurich.inventory.Controllers;


import com.zurich.inventory.Models.User;
import com.zurich.inventory.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserRepository userRepository;

    @PostMapping("/createUsers")
    public ResponseEntity<User> createUser(@RequestBody User userNew)
    {
        User saveUser = userRepository.save(userNew);
     return ResponseEntity.ok(saveUser);
    }

    @GetMapping("/users")
    public List<User> getAllUser()
    {
        return userRepository.giveAllUser();

    }
}
