package com.example.onlinecourse.service;


import com.example.onlinecourse.model.Role;
import com.example.onlinecourse.model.User;
import com.example.onlinecourse.repository.RoleReopsitory;
import com.example.onlinecourse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


@Service("UserService")
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleReopsitory roleReopsitory;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;




    @Override
    public List<User> findByExample(User example) {
        return userRepository.findAll();
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setActive(true);
        Role userRole = roleReopsitory.findByRole("ADMIN");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
        userRepository.save(user);
    }
}
