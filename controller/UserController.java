package com.example.onlinecourse.controller;


import com.example.onlinecourse.model.User;
import com.example.onlinecourse.repository.UserRepository;
import com.example.onlinecourse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/users")
public class UserController {

@Autowired
    private UserRepository userRepository;
@Autowired
    private UserService userService;

@GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUser(){

    return  userRepository.findAll();
}

@GetMapping(path ="/me")
    public Object me(){
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
}





}
