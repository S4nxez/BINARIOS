package org.example.domain;

import java.io.Serializable;

import static java.lang.Integer.parseInt;

public class Objeto implements Serializable {

    protected int id; // protected los atributos para que se puedan usar en los hijos
    protected String nombre;
    public Objeto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }


    public String toStringFichero(){
        return "\n"+id+";"+nombre+";";
    }
    @Override
    public String toString(){
        return "\nID: "+id+" nombre: "+nombre;
    }
}
