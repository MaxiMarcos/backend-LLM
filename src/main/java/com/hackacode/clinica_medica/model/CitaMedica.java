package com.hackacode.clinica_medica.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CitaMedica {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaConsulta;
    private LocalTime horaConsulta;


    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @OneToMany(mappedBy = "citaMedica")
    private List<Prestacion> listaPrestaciones;


    @ManyToOne
    @JoinColumn(name = "codigo_paquete")
    private Paquete paquete;

    private Double monto_total;
    private Boolean pagado;

}
