package com.iftm.apirest.controllers;


import com.iftm.apirest.models.User;
import com.iftm.apirest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user")
    public List<User> getAllEmails(){
        return userService.getAllUsers();
    }

    @GetMapping("user/{id}")
    public Optional<User> find(@PathVariable("id") Long id){
        return userService.getById(id);
    }

    @PostMapping("user")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("user")
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("user/{id}")
    public String delete(@PathVariable("id") Long id){
        return userService.delete(id);
    }

}
