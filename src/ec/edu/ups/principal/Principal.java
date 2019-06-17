/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import ec.edu.ups.controladores.ControladorEscritura;
import ec.edu.ups.controladores.ControladorLectura;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author tians
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<ArrayList> listas = new ArrayList<>();

        ControladorLectura controladorLectura = new ControladorLectura();
        ControladorEscritura controladorEscritura = new ControladorEscritura();

        controladorEscritura.setRuta("archivo1.txt");
        controladorEscritura.Escribir("Hola Mundo");
        controladorEscritura.nuevaLinea();
        controladorEscritura.Escribir("Chao Mundo");
        controladorEscritura.close();

        controladorEscritura = new ControladorEscritura();

        controladorEscritura.setRuta("archivo2.txt");
        controladorEscritura.Escribir("holo Mundo");
        controladorEscritura.nuevaLinea();
        controladorEscritura.Escribir("choo golaso de manguera alv");
        controladorEscritura.close();

        File ruta = new File("D:\\Programas NetBeans\\ManejoArchivosTexto\\src\\ec\\edu\\ups\\archivos");
        for (File archivo : ruta.listFiles()) {
            controladorLectura = new ControladorLectura();
            controladorLectura.setRuta(archivo.getName());
            controladorLectura.leer();
            listas.add(controladorLectura.palabrasRepetidas());
        }

        for (ArrayList lista : listas) {
            for (ArrayList lista2 : listas) {
                for (int i = 0; i < lista.size(); i++) {
                    
                }
            }
        }
    }
}
