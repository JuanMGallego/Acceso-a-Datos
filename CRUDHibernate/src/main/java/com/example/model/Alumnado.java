package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumnado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlumnado;

    private String nombre;

    private String apellidos;

    private String fechaNacimiento;

    public  Alumnado(){

    }

    public Alumnado(String nombre, String apellidos, String  fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdAlumnado() {
        return idAlumnado;
    }

    public void setIdAlumnado(Integer idAlumnado) {
        this.idAlumnado = idAlumnado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
