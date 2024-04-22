package com.citas.java.entidades;

import java.time.LocalDate;

public class Cita {

    public Integer id;
    public LocalDate fecha;
    
    public Cita(Integer id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
