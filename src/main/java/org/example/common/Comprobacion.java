package org.example.common;

public class Comprobacion {
    public static void comprobacionMenu(int i) throws menuException{
        if(i<1||i>5) throw new menuException();
    }

    public static void comprobacionId(int i) throws idException {
        if (i < 0) throw new idException();
    }
}
