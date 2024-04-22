package com.citas.java.entidades;



import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.Especialidad;

public class Medico extends Persona{
    //wrapper

    private Long RegistroMedico;
    private Especialidad especialidad;
    
    public Medico(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
            Long registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        RegistroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return RegistroMedico;
    }
    public void setRegistroMedico(Long registroMedico) {
        RegistroMedico = registroMedico;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico: " + getNombres() + ", Apellidos: " + " " + getApellidos() + ", " + "Especialidad: " + especialidad;
    }


    
}