package org.example.domain;

public class Objeto {

    int id;
    String nombre;
    public Objeto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return "ID: "+id+" nombre: "+nombre;
    }
}
