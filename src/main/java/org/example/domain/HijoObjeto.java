package org.example.domain;

public class HijoObjeto extends Objeto{
    private double num;
    public HijoObjeto(int id, String nombre, double num) {
        super(id, nombre);
        this.num = num;
        //super.id = id;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public HijoObjeto(String[] campos){
        this(Integer.parseInt(campos[0]), campos[1],Double.parseDouble(campos[2]));
    }

    public HijoObjeto(String linea){
        this(linea.split(";"));
    }

    public String toStringFichero(){
        return super.toStringFichero()+";"+num;
    }

    @Override
    public String toString() {
        return super.toString() + " num: " + num;
    }
}
