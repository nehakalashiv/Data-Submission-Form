package com.example.Data.Submission.Form.controller;

import com.example.Data.Submission.Form.entity.User;
import com.example.Data.Submission.Form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public String listOfUsers(Model model){
        model.addAttribute("users",userService.getAllUsers());
        return "users";
    }
    @GetMapping("/users/new")
    public String createUser(Model model){
        model.addAttribute("user",new User());
       return "createUser";
    }
    @PostMapping("/users")
    public String addUser(@ModelAttribute("user") User user){
        userService.addUser(user);
       return "redirect:/users";
    }
}
