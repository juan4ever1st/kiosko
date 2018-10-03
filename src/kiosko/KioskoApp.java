
package kiosko;

import java.util.Scanner;

public class KioskoApp {
    public static void main(String[] args) { /*Metodo main declarado en Principal*/
        
        Persona per = new Persona();//Creamos el objeto per de tipo persona
        //per.pedirDatos();//Llamamamos a la funcion pedirDatos disponible de la clase persona
        //per.mostrarDatos();//Llamamamos a la funcion MostrarDatos disponible de la clase persona
        // Instanciamos a la clase Articulo
        //Articulo art1 = new Articulo();
        //art1.pedirArt();
        //Venta venta1 = new Venta();
        //float calcularSubtotal;
        //calcularSubtotal = venta1.calcularSubtotal(art1.cantidad, art1.precio);
        //System.out.println("El subtotal es $" + calcularSubtotal);
        // MENU DE OPCIONES CON DO
        int opcion;
        do{
            Menu menu1 = new Menu();
            menu1.mostarMenu();
            System.out.println("Ingrese su opcion: ");
            Scanner opc = new Scanner(System.in);
            opcion = opc.nextInt();
            
            switch (opcion){
                case 1:
                    per.pedirDatos();
                    per.mostrarDatos();
                    break;
                case 2:
                    per.pedirDatos();
                    per.mostrarDatos();
                    break;
                case 3:
                    System.out.println("Nada por aqui todavia...");
                    break;
                default:
                    System.out.println("Error, elija una opción valida...");
                    break;
            }
        }while(opcion != 4);
    }
}