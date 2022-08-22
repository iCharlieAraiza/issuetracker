package com.example.issuetracker.tickets;

import com.example.issuetracker.auth.User;
import com.example.issuetracker.project.Project;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // <--- THIS is it
public class Ticket {
    private Long Id;
    private String number;
    private String description;
    private User user;
    private  Project project;
    private String status;

    public Ticket(String number, String description, User user, Project project){
        this.number = number;
        this.description = description;
        this.user = user;
        this.project = project;
    }

    public Ticket setStatus(String status) {
        this.status = status;
        return this;
    }
}
