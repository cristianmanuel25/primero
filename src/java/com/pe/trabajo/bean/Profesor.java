/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.trabajo.bean;

import java.util.Date;

/**
 *
 * @author cristian manuel
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private Integer nroCursos;
    private Date fechaNacimiento;
    private boolean estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroCursos() {
        return nroCursos;
    }

    public void setNroCursos(Integer nroCursos) {
        this.nroCursos = nroCursos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
  
}
