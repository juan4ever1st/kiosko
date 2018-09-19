/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosko;

/**
 *
 * @author PC
 */
public class KioskoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { /*Metodo main declarado en Principal*/
        
        Persona per = new Persona();//Creamos el objeto per de tipo persona
        per.pedirDatos();//Llamamamos a la funcion pedirDatos disponible de la clase persona
        per.mostrarDatos();//Llamamamos a la funcion MostrarDatos disponible de la clase persona
    
    }
    
}
