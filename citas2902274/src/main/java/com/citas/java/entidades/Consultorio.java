package com.citas.java.entidades;

public class Consultorio {

    public Integer id;
    public String direccion;
    public Long celular;
    
    public Consultorio(Integer id, String direccion, Long celular) {
        this.id = id;
        this.direccion = direccion;
        this.celular = celular;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Long getCelular() {
        return celular;
    }
    public void setCelular(Long celular) {
        this.celular = celular;
    }
    
}
