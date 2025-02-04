package com.fifi.apihrassociation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fifi.apihrassociation.models.User;
import com.fifi.apihrassociation.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    // create
    /*  public User addUser(@RequestBody User user) {
        return userService.addUser(user);
        } */
       
    @PostMapping("/create")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        try {
            return ResponseEntity.ok(userService.addUser(user));
        } catch (Exception e) {
           return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
    
}
