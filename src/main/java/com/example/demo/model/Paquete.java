package com.example.demo.model;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "paquete")
@Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor
@DiscriminatorValue(value=EnvioType.Values.PAQUETE)

public class Paquete extends AbstractEnvio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "perso_id")
    private Persona persona;


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

