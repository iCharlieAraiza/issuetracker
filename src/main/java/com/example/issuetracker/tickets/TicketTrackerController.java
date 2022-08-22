package com.example.issuetracker.tickets;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TicketTrackerController {
    final TrackServiceImpl service;

    public TicketTrackerController(TrackServiceImpl service) {
        this.service = service;
    }

    @GetMapping(path = "api/tickets", produces = { MediaType.APPLICATION_XML_VALUE })
    public List<Ticket> getAllIssues(){
        return service.getAll();
    }

    @GetMapping("api/tickets/{id}")
    Ticket getTicket(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("api/tickets/")
    String newEmployee(@RequestBody Ticket newTicket) {
        return "Added new ticket";
    }
}
