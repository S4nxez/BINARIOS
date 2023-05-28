package org.example.ui;

import org.example.common.Comprobacion;
import org.example.common.Constantes;
import org.example.common.idException;
import org.example.common.menuException;
import org.example.domain.Objeto;
import org.example.service.ServiciosObjeto;
import org.example.service.ServiciosObjetoImpl;

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
                i=0;
            }

            switch (i) {
                case 1:
                    crearObjeto();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    leerObjetos();
                    break;
                case 5:
                    break;
            }
        }
    }
    public void crearObjeto(){
        Scanner sc = new Scanner(System.in);
        System.out.print(Constantes.ID);
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print(Constantes.NOMBRE);
        String nombre = sc.nextLine();
        Objeto nuevoObjeto = null;
        try{
            nuevoObjeto= new Objeto(id,nombre);
            System.out.println(nuevoObjeto); //esto lo hace con el toString
            boolean ok = serviciosObjeto.addObjeto(nuevoObjeto);

        } catch (idException e){
            System.out.println(e.getMessage());
        }

    }
    public void leerObjetos(){
        serviciosObjeto.leerObjetos();
    }
}
