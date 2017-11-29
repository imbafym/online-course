package com.example.onlinecourse.model;



import javax.persistence.Entity;

import java.util.Set;


@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@JsonIgnoreProperties(value={"id"})
public class User {
    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    private String name;
    private String password;
    private String email;
    private Set<Role> roles;


    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
