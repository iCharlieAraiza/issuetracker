package com.example.issuetracker.auth;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    public User getUser(Long id) {
        return new User("Carlos", "Araiza", "Developer");
    }
}
