package com.crisishub_api.domain.user.controller;

import com.crisishub_api.domain.user.User;
import com.crisishub_api.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveDepartment(@RequestBody User user) {
        return userService.saveUser(user);
    }
    @GetMapping("/users")
    public List<User> fetchUserList(){
        return userService.fetchUserList();
    }

    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") Long userId){
        return userService.updateUser(user, userId);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable("id") Long userId){
        return "Delete user number: " + userId;
    }

}
