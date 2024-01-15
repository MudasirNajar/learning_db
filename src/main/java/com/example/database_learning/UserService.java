package com.example.database_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user) {
        userRepository.save(user);
        return "User saved successfully";
    }

    public User getUser(Integer userId) {
        try {
            return userRepository.findById(userId).get();
        } catch (Exception e) {
            System.out.println("We are in the exception and message is " + e.getMessage());
            return null;
        }

    }
}
