package com.example.issuetracker.project;

import java.util.ArrayList;
import java.util.List;

public class ProjectServicesImpl {
    public List<Project> projectList;

    public ProjectServicesImpl() {
        projectList = new ArrayList<>();
        projectList.add(new Project("CRM para gestión de proveedores tiendas", "OXXO"));
        projectList.add(new Project("Cotizador de precios de agencia de viajes", "Viaje Tip SA de CV"));
    }

    public Project getProject(Long id) {
        return projectList.get(0);
    }
}
