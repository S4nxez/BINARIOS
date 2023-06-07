package org.example.service;

import org.example.common.Comprobacion;
import org.example.common.idException;
import org.example.dao.DaoObjeto;
import org.example.dao.DaoObjetoImpl;
import org.example.domain.Objeto;

public class ServiciosObjetoImpl implements ServiciosObjeto{
    private final DaoObjeto daoObjeto;

    public ServiciosObjetoImpl() {
        this.daoObjeto = new DaoObjetoImpl();
    }

    @Override
    public boolean addObjeto(Objeto objeto) throws idException {
        Comprobacion.comprobacionId(objeto.getId());
        return daoObjeto.addObjeto(objeto);
    }

    @Override
    public void leerObjetos() {
        System.out.println(daoObjeto.leerObjeto());
    }

    @Override
    public void EscribirBinario() {
        daoObjeto.escribirBinario();
    }

    @Override
    public void cargarDeBinario() {
        daoObjeto.cargarDeBinario();
    }

    @Override
    public void escribirTexto() {
        daoObjeto.escribirTexto();
    }
}
