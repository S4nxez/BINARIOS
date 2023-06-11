package org.example.domain;

import java.util.List;


public class ObjetoHijoLista extends Objeto{
    private List<String> lista;

    public ObjetoHijoLista(int id, String nombre,List<String> lista) {
        super(id, nombre);
        this.lista = lista;
    }

    private String escribirLista(){
        StringBuilder strin = new StringBuilder();

        for (String e: lista) {
            if (!e.equals("0"))strin.append(e).append(":");
            else{//le quito los dos puntos del final y le meto dos al principio para diferenciar cuando empiezan los pueblos
                strin.deleteCharAt(strin.length()-1);
                strin.insert(0,":");
            }
        }
        return strin.toString();
    }

    public String toStringFichero(){
        return super.toStringFichero()+escribirLista();
    }

    @Override
    public String toString() {
        return super.toString() + " lista: "+ lista;
    }
}
