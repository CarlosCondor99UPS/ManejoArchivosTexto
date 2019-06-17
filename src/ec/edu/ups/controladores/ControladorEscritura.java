/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tians
 */
public class ControladorEscritura {
    private String ruta;
    private FileWriter archivo;
    private BufferedWriter escritura;

    public ControladorEscritura() {
    }

    public ControladorEscritura(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
        try {
            
            archivo = new FileWriter(ruta, false);
            escritura = new BufferedWriter(archivo);
        } catch (IOException ex) {
            Logger.getLogger(ControladorEscritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Escribir(String texto){
        try {
            
            escritura.append(texto);
        } catch (IOException ex) {
            System.out.println("Error de escritura"+ex);
        }
    }
    
    public void nuevaLinea(){
        try {
            
            escritura.newLine();
        } catch (IOException ex) {
            System.out.println("Error de escritura"+ex);
        }
    }
    
    public void close(){
        try {
            escritura.close();
            archivo.close();
        } catch (IOException ex) {
            Logger.getLogger(ControladorEscritura.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
}
