package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TestController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
       return userService.addUser(user);
   }
   @GetMapping("/user")
    public  User getUser(@RequestParam String id){
        return userService.getUser(id);
   }
   @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
   }
   @PutMapping("/update")
    public  User updateUser(@RequestBody User user){
        return userService.updateUser(user);
   }
   @DeleteMapping("/delete")
    public String deleteUser(@RequestParam String id){
        return userService.deleteUser(id);
   }
}
