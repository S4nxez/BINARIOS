package org.example.dao;

import org.example.domain.Objeto;

import java.util.List;

public class DaoObjetoImpl implements DaoObjeto {
    private final Database database;

    public DaoObjetoImpl(){ this.database= new Database(); }
    public DaoObjetoImpl(Database database){ this.database=database;}
    @Override
    public boolean addObjeto(Objeto objeto) {
        return database.getListaObjetos().add(objeto);
    }

    @Override
    public List<Objeto> leerObjeto() {
        return database.getListaObjetos();
    }
}
