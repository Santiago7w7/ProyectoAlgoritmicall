package com.domain;

import java.io.Serializable;

/**
 *
 * @author Santaigo
 */
public class Cliente implements Serializable{
    
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Cliente["+ nombre + " " + apellido + ']';
    }
    
}
