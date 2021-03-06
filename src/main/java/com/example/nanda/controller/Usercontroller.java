package com.example.nanda.controller;

import com.example.nanda.model.User;
import com.example.nanda.service.MyUserservice;
import com.example.nanda.service.MyUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    private MyUserservice service;

    @RequestMapping("/testman")
    public ModelAndView test() {
        return new ModelAndView("User/Userdetails");
    }

    @GetMapping("/")
    public ModelAndView getallUsers() {
        List<User> users = service.getallUsers();
        return new ModelAndView("User/Userdetails", "users", users);
    }

    @RequestMapping("/user")
    public ModelAndView createpage(@ModelAttribute("user") User user) {
        return new ModelAndView("User/AddUser");
    }

    @PostMapping("/adduser")
    public ModelAndView addUser(@ModelAttribute("user") User user) {
        User user1 = service.createuser(user);
        return new ModelAndView("redirect:/user/");
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView deleteApple(@PathVariable("id") int id) {
        service.deleteuser(id);
        return new ModelAndView("redirect:/user/");

    }

    @RequestMapping("/update/{id}")
    public ModelAndView updateUser(@PathVariable("id") int id) {
        User user = service.getoneUser(id);
        return new ModelAndView("User/AddUser", "user", user);
    }

}
