package com.example.envios.services;

import com.example.envios.model.*;
import com.example.envios.repositories.EnvioRepository;
import com.example.envios.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnvioServiceImpl implements EnvioService{

    private final EnvioRepository envioRepository;
    private final PersonaRepository personaRepository;
    private final EnvioFactory envioFactory;

    @Autowired
    public EnvioServiceImpl(EnvioRepository shapeRepository,
                            EnvioFactory shapeFactory, PersonaRepository personaRepository) {
        this.envioRepository = shapeRepository;
        this.personaRepository = personaRepository;
        this.envioFactory = shapeFactory;
    }

    @Override
    public Envio saveCarta( Long remitenteId, Long destinatarioId) {
        Optional<Persona> remitente = personaRepository.findById(remitenteId);
        if (!remitente.isPresent()) {
            throw new RuntimeException("Remitente inexistente");
        }

        Optional<Persona> destinatario = personaRepository.findById(destinatarioId);
        if (!destinatario.isPresent()) {
            throw new RuntimeException("Destinatario inexistente");
        }

        Carta carta = (Carta) envioFactory.createEnvio(EnvioType.CARTA);
        carta.setParams(remitente.get(), destinatario.get());

        return saveEnvio(carta);
    }

    @Override
    public Envio savePaquete(double peso, double alto, double ancho, Long remitenteId, Long destinatarioId) {
        Optional<Persona> remitente = personaRepository.findById(remitenteId);
        if (!remitente.isPresent()) {
            throw new RuntimeException("Remitente inexistente");
        }

        Optional<Persona> destinatario = personaRepository.findById(destinatarioId);
        if (!destinatario.isPresent()) {
            throw new RuntimeException("Destinatario inexistente");
        }

        Paquete paquete = (Paquete) envioFactory.createEnvio(EnvioType.PAQUETE);
        paquete.setParams(peso,alto,ancho,destinatario.get(),remitente.get());

        return saveEnvio(paquete);
    }

    public Envio saveEnvio(Envio envio) {
        return envioRepository.save((AbstractEnvio) envio);
    }


}
