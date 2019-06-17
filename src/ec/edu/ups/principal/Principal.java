/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import ec.edu.ups.controladores.ControladorEscritura;
import ec.edu.ups.controladores.ControladorLectura;
import java.io.File;

/**
 *
 * @author tians
 */
public class Principal {
    public static void main(String[] args) {
        ControladorLectura controladorLectura=new ControladorLectura();
        ControladorEscritura controladorEscritura=new ControladorEscritura();
        
        controladorEscritura.setRuta("archivo1.txt");
        controladorEscritura.Escribir("Hola Mundo");
        controladorEscritura.nuevaLinea();
        controladorEscritura.Escribir("Chao Mundo");
        controladorEscritura.close();
        
        controladorEscritura= new ControladorEscritura();
        
        controladorEscritura.setRuta("archivo2.txt");
        controladorEscritura.Escribir("Hola Mundo");
        controladorEscritura.nuevaLinea();
        controladorEscritura.Escribir("Chao gil");
        controladorEscritura.close();
            
        int anterior;
        File ruta=new File("C:\\Users\\tians\\Documents\\NetBeansProjects\\ManejoArchivosTexto\\src\\ec\\edu\\ups\\archivos");
        for (File archivo : ruta.listFiles()){
            
        }
         controladorLectura.setRuta("archivo1.txt");
         controladorLectura.leer();
         controladorLectura.palabrasRepetidas();
        
    }
}
