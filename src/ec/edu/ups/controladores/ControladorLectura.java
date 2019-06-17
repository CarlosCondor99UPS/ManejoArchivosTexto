/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tians
 */
public class ControladorLectura {

    private String ruta;
    private String texto;
    private Set<String> palabras;

    public ControladorLectura() {
        palabras = new HashSet<>();
    }

    public ControladorLectura(String ruta, String texto) {
        this.ruta = ruta;
        this.texto = texto;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void leer() {
        String texto = "";
        try {
            FileReader archivo = new FileReader(ruta);
            BufferedReader lectura = new BufferedReader(archivo);
            String linea=" " ;
            
            while (linea != null && !linea.equals("null")) {
                linea = lectura.readLine();
                texto = texto + linea + "\n";
            }
            this.texto = texto;
        } catch (FileNotFoundException ex1) {
            System.out.println("Archivo " + ruta + " no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }      
    }
    
    public void palabrasRepetidas(){
        int anterior=0,cont=0;
        String palabra;
        for (int i=0;i<texto.length();i++){
            if (String.valueOf(texto.charAt(i)).equals(" ")){
                palabra=texto.substring(anterior,i).trim();
                System.out.println(palabra);
                anterior=i;
                cont++;
            }else if (i==texto.length()-1){
                palabra=texto.substring(anterior,i).trim();
                System.out.println(palabra);
                anterior=i;
                cont++;
            }
        }
        
    }
}
