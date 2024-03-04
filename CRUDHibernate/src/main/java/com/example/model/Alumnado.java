package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Alumnado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlumnado;

    private String nombre;

    private String apellidos;

    private Date fechaNacimiento;

    public  Alumnado(){

    }

    public Alumnado(Integer idAlumnado, String nombre, String apellidos, Date fechaNacimiento) {
        this.idAlumnado = idAlumnado;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumnado{" +
                "idAlumnado=" + idAlumnado +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
