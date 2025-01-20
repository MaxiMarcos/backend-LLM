package com.hackacode.clinica_medica.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Medico {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long medico_id;
    private String apellido;
    private String nombre;
    private String especialidad_medica;
    private Map<LocalDate, List<LocalTime>> turnosDisponibles;
    private Double sueldo;
    @OneToMany (mappedBy = "medico")
    private List<CitaMedica> listaCitasMedicas;
}
