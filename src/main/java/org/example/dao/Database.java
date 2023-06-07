package org.example.dao;

import org.example.domain.Objeto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Objeto> Objetos;

    public Database() {
        Objetos = new ArrayList<>();
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

    public void escribirBinario(){
        File binario = new File("ArchivoBinario");
        try(FileOutputStream fos = new FileOutputStream(binario); ObjectOutputStream objOut = new ObjectOutputStream(fos)){
            objOut.writeObject(Objetos);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void cargarDeBinario(){
        File binario = new File("ArchivoBinario");
        Objetos.clear();
        try(FileInputStream fileIn = new FileInputStream(binario);
            ObjectInputStream objIn = new ObjectInputStream(fileIn)){
            Objetos.addAll((List<Objeto>) objIn.readObject());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void escribirEnTxt() {
        String nombreArchivo = "ArchivoTexto.txt";
        try (FileWriter fw = new FileWriter(nombreArchivo)) {
            for (Objeto objeto : Objetos) {
                String objetoString = objeto.toStringFichero(); // Obtener el string del objeto utilizando el método toStringFichero
                fw.write(objetoString);
            }
            System.out.println("Objeto guardado correctamente en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el objeto en el archivo: " + e.getMessage());
        }
    }
}
