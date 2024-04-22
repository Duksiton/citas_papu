package com.citas.java.entidades;

import java.time.LocalDateTime;

import com.citas.java.enumeraciones.EstadoCita;

public class CitaMedico extends Cita implements IAgendamiento{

    private String motivo;
    private Medico medico;
    private EstadoCita estadoCita;
    public String getEstadoCita;

    public CitaMedico(LocalDateTime fecha, Paciente paciente, String motivo, Medico medico, EstadoCita estadoCita) {
        super(fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
        this.estadoCita = estadoCita.AGENDADA;



    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    @Override
    public void agendarCita(LocalDateTime fechaCita) {
        this.setFecha(fechaCita);
        this.setEstadoCita(EstadoCita.AGENDADA);
    }

    @Override
    public void cancelarCita() {
        this.estadoCita = EstadoCita.CANCELADA;
        System.out.println(medico.getNombres());
    }

    @Override
    public void reagendarCita(LocalDateTime fechaCita) {
        this.setFecha(fechaCita);
    }

    @Override
    public String toString() {
        return "Fecha: " + " " + getFecha()  + " " + getPaciente() + ", Motivo: "
        + " "  + getMotivo()  + ", " + getMedico()  + ".";
    }

}
