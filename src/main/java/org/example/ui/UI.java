package org.example.ui;

import org.example.common.Comprobacion;
import org.example.common.Constantes;
import org.example.common.idException;
import org.example.common.menuException;
import org.example.domain.HijoObjeto;
import org.example.domain.Objeto;
import org.example.domain.ObjetoHijoLista;
import org.example.service.ServiciosObjeto;
import org.example.service.ServiciosObjetoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    private final ServiciosObjeto serviciosObjeto; //El main llama al service

    public UI() {
        this.serviciosObjeto = new ServiciosObjetoImpl();
    }

    public void main() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            System.out.println(Constantes.MENU);

            try {
                i = sc.nextInt();
                Comprobacion.comprobacionMenu(i);
            } catch (menuException e) {
                System.out.println(e.getMessage());
                i = 0;
            }

            switch (i) {
                case 1:
                    crearObjeto();
                    i = 0;
                    break;
                case 2:
                    serviciosObjeto.cargarDeBinario();
                    i = 0;
                    break;
                case 3:
                    break;
                case 4:
                    serviciosObjeto.leerObjetos();
                    i = 0;
                    break;
                case 5:
                    serviciosObjeto.EscribirBinario();
                    i = 0;
                    break;
                case 6:
                    serviciosObjeto.escribirTexto();
                    i=0;
                    break;
                case 7:
                    serviciosObjeto.EscribirBinario();
                    break;
            }
        }
    }

    public void crearObjeto() {
        Scanner sc = new Scanner(System.in);
        System.out.print(Constantes.TIPO);
        int tipo = sc.nextInt();
        sc.nextLine();
        System.out.print(Constantes.ID);
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print(Constantes.NOMBRE);
        String nombre = sc.nextLine();
        List<String> cadenas;
        try {
            if (tipo == 1) {
                HijoObjeto nuevoObjeto = new HijoObjeto(id, nombre, 3.33);
                System.out.println(nuevoObjeto); //esto lo hace con el toString
                boolean ok = serviciosObjeto.addObjeto(nuevoObjeto);
            } else if (tipo == 2) {
                cadenas = new ArrayList<>();
                String cadena="";
                System.out.println(Constantes.PEDIRLISTA);
                while (!cadena.equals("0")){
                    cadena = sc.nextLine();
                    cadenas.add(cadena);
                }
                ObjetoHijoLista nuevoObjeto = new ObjetoHijoLista(id, nombre, cadenas);
                System.out.println(nuevoObjeto);
                boolean ok = serviciosObjeto.addObjeto(nuevoObjeto);
            }
        } catch (idException e) {
            System.out.println(e.getMessage());
        }
    }
}
