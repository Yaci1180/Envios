package com.example.demo.model;

import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value=EnvioType.Values.CARTA)
@NoArgsConstructor
public class Carta extends AbstractEnvio {

    public void setParams(String remitente, String destinatario) {
    }

    @Override
    public String getRemitente(){
        return super.getRemitente();
    }

    @Override
    public String getDestinatario(){
        return super.getDestinatario();
    }
}
