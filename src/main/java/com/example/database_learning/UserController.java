package com.example.database_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("userId") Integer userId){
        return userService.getUser(userId);
    }
}
