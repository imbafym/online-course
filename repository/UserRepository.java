package com.example.onlinecourse.repository;


import com.example.onlinecourse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{

    User findById(Long id);

    User findByEmail(String email);


    List<User> findAll();






}
