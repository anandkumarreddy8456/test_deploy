package com.example.demo.service;

import com.example.demo.dto.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.insert(user);
    }
    public User updateUser(User user){
        User userold=userRepository.findById(user.getId()).get();
        userold.setName(user.getName());
        userold.setName(user.getName());
        userold.setRole(user.getRole());
        userRepository.deleteById(user.getId());
        return userRepository.insert(userold);
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
