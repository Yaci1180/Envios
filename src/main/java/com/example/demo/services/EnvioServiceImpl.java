package com.example.demo.services;

import com.example.demo.model.*;
import com.example.demo.repositories.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvioServiceImpl implements EnvioService{

    private final EnvioRepository envioRepository;
    private final EnvioFactory envioFactory;

    @Autowired
    public EnvioServiceImpl(EnvioRepository shapeRepository,
                            EnvioFactory shapeFactory) {
        this.envioRepository = shapeRepository;
        this.envioFactory = shapeFactory;
    }

    @Override
    public Envio saveCarta(String remitente, String destinatario) {
        Carta carta = (Carta) envioFactory.createEnvio(EnvioType.CARTA);
        carta.setParams(remitente, destinatario);

        return saveEnvio(carta);
    }

    @Override
    public Envio savePaquete(double peso, double alto, double ancho, String remitente, String destinatario) {
        Paquete paquete = (Paquete) envioFactory.createEnvio(EnvioType.PAQUETE);
        paquete.setParams(peso,alto,ancho,destinatario,remitente);

        return saveEnvio(paquete);
    }

    public Envio saveEnvio(Envio envio) {
        return envioRepository.save((AbstractEnvio) envio);
    }


}
