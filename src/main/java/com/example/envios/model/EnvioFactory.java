package com.example.envios.model;

import org.springframework.stereotype.Component;

@Component
public class EnvioFactory {

    public Envio createEnvio(EnvioType envioType) {
        switch (envioType) {
            case PAQUETE:
                return new Paquete();
            case CARTA:
                return new Carta();
            default:
                throw new RuntimeException();
        }
    }
}


