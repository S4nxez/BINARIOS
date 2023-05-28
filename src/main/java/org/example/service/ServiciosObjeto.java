package org.example.service;

import org.example.common.idException;
import org.example.domain.Objeto;

public interface ServiciosObjeto {
    public boolean addObjeto(Objeto objeto) throws idException;

    public void leerObjetos();
}
