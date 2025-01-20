package com.hackacode.clinica_medica.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Paquete {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long codigo_paquete;
    private Double precio;

    @OneToMany (mappedBy = "paquete")
    private List<Prestacion> listaPrestaciones;

    @OneToMany(mappedBy = "paquete")
    private List<CitaMedica> listaCitasMedicas;

}
