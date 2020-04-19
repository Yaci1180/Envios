package com.example.envios.model;

public interface Envio {

    double getPeso();
    double getAncho();
    double getAlto();
    Persona getDestinatario();
    Persona getRemitente();
}
