package com.citas.java.entidades;

import java.time.LocalDate;

import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Paciente {

    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private Long numeroDocumento;
    private String correoElectronico;
    private Long celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;
    public Paciente(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
                String correoElectronico, Long celular, LocalDate fechaNacimiento, double d, double e,
                TipoSangre tipoSangre, char factorRH) {
    this.id = id;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.tipoDocumento = tipoDocumento;
    this.numeroDocumento = numeroDocumento;
    this.correoElectronico = correoElectronico;
    this.celular = celular;
    this.fechaNacimiento = fechaNacimiento;
    this.altura = (double) d; 
    this.peso = (double) e; 
    this.tipoSangre = tipoSangre;
    this.factorRH = factorRH;
}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public Long getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public Long getCelular() {
        return celular;
    }
    public void setCelular(Long celular) {
        this.celular = celular;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    public char getFactorRH() {
        return factorRH;
    }
    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    @Override
    public String toString() {
        return getNombres() + ", Apellidos: "  + " " + getApellidos() + ", Tipo_Sangre: "
        + " "     + getTipoSangre() + ", FactorRH: " + " " + getFactorRH();
    }

    
}
