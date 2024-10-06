package com.example.demo.service;

import com.example.demo.dto.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        String randomID = UUID.randomUUID().toString();
        user.setId(randomID);
        return userRepository.insert(user);
    }
    public User updateUser(User user) {
        User userOld = userRepository.findById(user.getId()).orElseThrow(() -> new RuntimeException("User not found"));
        userOld.setName(user.getName());
        userOld.setRole(user.getRole());
        userOld.setCost(user.getCost());
        // Save the updated user
        return userRepository.save(userOld);
    }

    public String deleteUser(String id){
        userRepository.deleteById(id);
        return "User Successfully Deleted";
    }
    public User getUser(String id){
        return  userRepository.findById(id).get();
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
