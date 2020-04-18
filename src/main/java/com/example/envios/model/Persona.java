package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "personas")
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@Builder

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "persona")
    private List<Paquete> paquetes;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "persona")
    private Set<AbstractEnvio>enviosRecibidos;

}
