package com.example.issuetracker.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String name;
    private String lastName;
    private String role;
    public User(String name, String lastName, String role) {
        this.name = name;
        this.lastName = lastName;
        this.role = role;
    }
}
