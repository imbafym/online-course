package com.example.onlinecourse.service;


import com.example.onlinecourse.model.User;

import java.util.List;

public interface UserService {

    List<User> findByExample(User example);

    User findUserByEmail(String email);

    void saveUser(User user);


}
