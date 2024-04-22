package com.citas.java;

import java.time.LocalDate;
import java.time.Month;

import com.citas.java.entidades.Enfermeros;
import com.citas.java.entidades.Medico;
import com.citas.java.entidades.Paciente;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Main {
    public static void main(String[] args) {
        //crear un medico
        //crear un objeto medico
        //crea una instancia de medico
        Medico m = new Medico(3, "Cristian", "Buitrago", TipoDocumento.CC ,
        1028897665L, 2536787L, Especialidad.ODONTOLOGIA);
        
        Paciente p = new Paciente(4, "Sebastian", "Olaya", TipoDocumento.TI , 
        9286284728L, "sa.olaya@arp.edu.co", 325754679L, LocalDate.of(2007, Month.DECEMBER, 12) , 1.60 , 50.7, TipoSangre.A, '+');
        
        Enfermeros e = new Enfermeros(5, "Sergio", "Romero", TipoDocumento.TI, 1028861779L, Especialidad.VACUNACION);



        System.out.println(e.toString());
        System.out.println(m.toString());
        System.out.println(p.toString());
    }
}