package com.citas.java.entidades;

import com.citas.java.enumeraciones.ProcedimientosEnfermeria;
import com.citas.java.enumeraciones.TipoDocumento;


public class Enfermeros extends Persona{

   private ProcedimientosEnfermeria procedimiento;


   
    public Enfermeros(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
        ProcedimientosEnfermeria procedimiento) {
    super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
    this.procedimiento = procedimiento;
}




    @Override
    public String toString() {
        return "Enfermero: "  + getNombres() + " " + getApellidos()+ " "  ;
    }




    public ProcedimientosEnfermeria getProcedimiento() {
        return procedimiento;
    }




    public void setProcedimiento(ProcedimientosEnfermeria procedimiento) {
        this.procedimiento = procedimiento;
    }

 
    
     
}
