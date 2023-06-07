package org.example.dao;

import org.example.domain.Objeto;

import java.util.List;

public interface DaoObjeto {
    public boolean addObjeto(Objeto objeto);
    public List<Objeto> leerObjeto();
    public void escribirBinario();

    public void cargarDeBinario();

    public void escribirTexto();
}
