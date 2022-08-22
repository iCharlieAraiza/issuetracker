package com.example.issuetracker.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    final UserServiceImpl serviceUser;

    public UserController(UserServiceImpl serviceUser) {
        this.serviceUser = serviceUser;
    }

    @GetMapping("api/users")
    String getAll() {
        return "Forbidden section - Solo se puede acceder si estás autenticado";
    }

    @GetMapping("api/users/{id}")
    User getUser(@PathVariable Long id) {
        return serviceUser.getUser(id);
    }
}
