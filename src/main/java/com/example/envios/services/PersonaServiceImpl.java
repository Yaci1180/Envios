package com.example.envios.services;

import com.example.envios.model.Envio;
import com.example.envios.model.Paquete;
import com.example.envios.model.Persona;
import com.example.envios.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public Persona createPersona(String nombre, String apellido, String direccion) {
        Persona persona = Persona.builder()
                .nombre(nombre)
                .apellido(apellido)
                .direccion(direccion)
                .build();

        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }
}