package com.citas.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import com.citas.java.entidades.Cita;
import com.citas.java.entidades.CitaEnfermero;
import com.citas.java.entidades.CitaMedico;
import com.citas.java.entidades.Enfermeros;
import com.citas.java.entidades.Medico;
import com.citas.java.entidades.Paciente;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.EstadoCita;
import com.citas.java.enumeraciones.ProcedimientosEnfermeria;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Main {
    public static void main(String[] args) {
        //crear un medico
        //crear un objeto medico
        //crea una instancia de medico
       
        Medico m = new Medico(3, "Cristian", "Buitrago", TipoDocumento.CC , 1028897665L, 2536787L, Especialidad.ODONTOLOGIA);
        Medico m2 = new Medico(4, "Papu", "Wilson", TipoDocumento.CC , 56457474564L, 2455347L, Especialidad.CARDIOLOGIA);
        
        Paciente p = new Paciente(4, "Sebastian", "Olaya", TipoDocumento.TI , 9286284728L, "sa.olaya@arp.edu.co", 325754679L, LocalDate.of(2007, Month.DECEMBER, 12) , 1.60 , 50.7, TipoSangre.A, '+');
        Paciente p2 = new Paciente(5, "Daniel", "SmallCock", TipoDocumento.CC , 45456456456L, "da.cock@arp.edu.co", 32245773L, LocalDate.of(2004, Month.MARCH, 19) , 1.99 , 20.7, TipoSangre.B, '+');
        Paciente p3 = new Paciente(6, "Youngcock", "ChinChon", TipoDocumento.CC , 7453453564L, "yo.cock@arp.edu.co", 3227468798L, LocalDate.of(1990, Month.AUGUST, 8) , 5.99 , 12.7, TipoSangre.O, '-');
        Paciente p4 = new Paciente(7, "Nicolas", "Velez", TipoDocumento.CC , 74968096806L, "ni.velez@arp.edu.co", 36767677677L, LocalDate.of(1998, Month.AUGUST, 12) , 6.99 , 87.7, TipoSangre.O, '-');
        Paciente p5 = new Paciente(8, "Pilin", "Piolin", TipoDocumento.CC , 789749500988L, "pi.piolin@arp.edu.co", 31365787890L, LocalDate.of(1978, Month.NOVEMBER, 4) , 0.50 , 2, TipoSangre.AB, '+');


        Enfermeros e = new Enfermeros(5, "Sergio", "Romero", TipoDocumento.TI , 1634264889L, ProcedimientosEnfermeria.VACUNACION);
        Enfermeros e2 = new Enfermeros(6, "Tilin", "Smegma", TipoDocumento.CC , 477543753L, ProcedimientosEnfermeria.CUIDADOS_PALIATIVOS);
        Enfermeros e3 = new Enfermeros(7, "Homero", "Chino", TipoDocumento.CC , 84753434534L, ProcedimientosEnfermeria.PROCEDIMIENTOS_AMBULATORIOS);

       
        System.out.println(m.toString());
        System.out.println(m2.toString());
        

        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());

        System.out.println(e.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        CitaMedico cm1  = new CitaMedico(LocalDateTime.of(2024, Month.JANUARY, 3, 11,30,00), p, "Gripe", m, null);
        System.out.println(cm1.toString());
        System.out.println("Estado de la cita: " + " " + cm1.getEstadoCita() );

        CitaMedico cm2 = new CitaMedico(LocalDateTime.of(2024, Month.OCTOBER, 13,13,30,00), p2, "Escopolamina", m2, null);
        System.out.println(cm2.toString());
        System.out.println("Estado de la cita: " + " " + cm2.getEstadoCita());

        CitaEnfermero ce1 = new CitaEnfermero(LocalDateTime.of(2024, Month.MAY, 16,15,00,00), p3, ProcedimientosEnfermeria.VACUNACION, e);
        System.out.println(ce1.toString());
       
    }
}   