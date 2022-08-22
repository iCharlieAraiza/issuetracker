package com.example.issuetracker.project;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @NoArgsConstructor
public class Project {
    private Long ID;
    private String name;
    private String client;
    private String date;

    public Project(String name, String client) {
        this.name = name;
        this.client = client;
        this.date = new Date().toString();
    }

}
