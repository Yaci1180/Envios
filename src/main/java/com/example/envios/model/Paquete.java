package com.example.envios.model;

import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value=EnvioType.Values.PAQUETE)
@NoArgsConstructor
public class Paquete extends AbstractEnvio {

    public void setParams(double peso,double alto, double ancho, String remitente, String destinatario) {
        super.setPeso(peso);
        super.setAlto(alto);
        super.setAncho(ancho);
        super.setRemitente(remitente);
        super.setDestinatario(destinatario);

    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    @Override
    public double getAlto(){
        return super.getAlto();
    }

    @Override
    public double getAncho(){
        return super.getAncho();
    }

    @Override
    public String getDestinatario(){
        return super.getDestinatario();
    }

    @Override
    public  String getRemitente(){
        return super.getRemitente();
    }
}

