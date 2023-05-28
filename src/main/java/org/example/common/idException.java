package org.example.common;

public class idException extends Exception{
    public idException(){
        super("El ID debe ser mayor que cero");
    }
}
