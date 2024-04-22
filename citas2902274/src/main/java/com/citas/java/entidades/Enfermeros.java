package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.Especialidad;

public class Enfermeros extends Persona {

    private Especialidad especialidad;

    public Enfermeros(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
            Especialidad especialidad) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Enfermeros: " + getNombres() + " " + getApellidos() + " " + getNumeroDocumento() + " "
                + getEspecialidad();
    }

}