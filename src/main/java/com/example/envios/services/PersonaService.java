package com.example.envios.services;

import com.example.envios.model.Persona;

import java.util.List;

public interface PersonaService {

    Persona createPersona(String nombre, String apellido, String direccion);
    List<Persona> verPersonas();
}
