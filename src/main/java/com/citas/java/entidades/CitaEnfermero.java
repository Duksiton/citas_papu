package com.citas.java.entidades;


import java.time.LocalDateTime;

import com.citas.java.enumeraciones.ProcedimientosEnfermeria;

public class CitaEnfermero extends Cita implements IAgendamiento {

    private ProcedimientosEnfermeria procedimiento;
    private Enfermeros enfermeros;
    public CitaEnfermero(LocalDateTime fecha, Paciente paciente, ProcedimientosEnfermeria procedimiento,
            Enfermeros enfermeros) {
        super(fecha, paciente);
        this.procedimiento = procedimiento;
        this.enfermeros = enfermeros;
    }
    public ProcedimientosEnfermeria getProcedimiento() {
        return procedimiento;
    }
    public void setProcedimiento(ProcedimientosEnfermeria procedimiento) {
        this.procedimiento = procedimiento;
    }
    public Enfermeros getEnfermeros() {
        return enfermeros;
    }
    public void setEnfermeros(Enfermeros enfermeros) {
        this.enfermeros = enfermeros;
    }
    @Override
    public void agendarCita(LocalDateTime fechaCita) {
        
    }
    @Override
    public void cancelarCita() {
        System.out.println("Cita para procedimiento: " + this.procedimiento + " cancelada");
    }
    @Override
    public void reagendarCita(LocalDateTime fechaCita) {
        
    }
    @Override
    public String toString() {
        return "CitaEnfermero: " + "" + getFecha() + ", Paciente: " + getPaciente() + ", Procedimiento: "
                + getProcedimiento() + ", " + getEnfermeros() + "";
    }

        

}
