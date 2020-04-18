package com.example.envios.model;

import lombok.ToString;

@ToString
public enum EnvioType {

    PAQUETE(Values.PAQUETE),
    CARTA(Values.CARTA);

    private final String envioType;

EnvioType(final String envioType) {
            this.envioType = envioType;
        }
    public static class Values {
    public static final String PAQUETE = "PAQUETE";
    public static final String CARTA = "CARTA";
    }
}


