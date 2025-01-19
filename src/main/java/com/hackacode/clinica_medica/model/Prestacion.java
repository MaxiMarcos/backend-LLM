package com.hackacode.clinica_medica.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Prestacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int codigo;
    private String descripcion;
    private String nombre;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "citaMedica_id", nullable = false)
    private CitaMedica citaMedica;
}
