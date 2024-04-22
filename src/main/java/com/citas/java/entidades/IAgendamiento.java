package com.citas.java.entidades;

import java.time.LocalDateTime;

public interface IAgendamiento {
    //definiciones de métodos
    //sólo se pone las firmas de métodos
    //la implementación corre por cuenta de las clases
    public void agendarCita(LocalDateTime fechaCita);
    public void cancelarCita();
    public void reagendarCita(LocalDateTime fechaCita);
    
}
