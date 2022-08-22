package com.example.issuetracker.tickets;

import com.example.issuetracker.auth.User;
import com.example.issuetracker.project.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrackServiceImpl {
    List<Ticket> all =  new ArrayList<>();

    public TrackServiceImpl() {
        User user = new User("Carlos", "Araiza", "Developer");
        Project projectA = new Project("CRM para gestión de proveedores tiendas", "OXXO");
        Project projectB = new Project("Cotizador de precios de agencia de viajes", "Viaje Tip SA de CV");
        all.add(new Ticket("P1123", "Arreglar el controlador de la API rest", user,projectA).setStatus("pending"));
        all.add(new Ticket("P1123", "Completar la lista de tareas", user, projectA).setStatus("complete"));
        all.add(new Ticket("A1123", "Crear una nueva imágen de captura", user,projectA).setStatus("pending"));
    }

    List<Ticket> getAll() {
        return all;
    }

    Ticket get(Long id){
        return  all.get(0);
    }
}
