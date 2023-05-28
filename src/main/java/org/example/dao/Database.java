package org.example.dao;

import org.example.domain.Objeto;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Objeto> Objetos;

    public Database() {
        this.Objetos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Objetos.add(new Objeto(i,"Objeto"+i));
        }
    }

    public Database(List<Objeto> objetos) {
        this.Objetos = objetos;
    }

    public List<Objeto> getListaObjetos() {
        return Objetos;
    }


    public void setObjetos(List<Objeto> NuevaLista){ //para que objetos pueda seguir siendo final, vacias y metes.
        Objetos.clear();
        Objetos.addAll(NuevaLista);
    }
}
