package com.example.myclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    private Paciente paciente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_odontologo", referencedColumnName = "id")
    private Odontologo odontologo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
