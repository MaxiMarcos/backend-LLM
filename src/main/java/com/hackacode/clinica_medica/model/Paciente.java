package com.hackacode.clinica_medica.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Paciente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long paciente_id;
    private String apellido;
    private String nombre;
    private LocalDate fecha_nacimiento;
    private String dni;
    private String telefono;
    private String direccion;
    private String email;
    @OneToMany (mappedBy = "paciente")
    private List<CitaMedica> listaCitas;
}
