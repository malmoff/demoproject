package com.example.demoproject.Service;


import com.example.demoproject.Entity.User;
import com.example.demoproject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<User> GetAllUsers() {
        return userRepository.findAll();
    }
}