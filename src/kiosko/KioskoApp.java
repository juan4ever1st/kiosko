
package kiosko;

import java.util.Scanner;

public class KioskoApp {
    public static void main(String[] args) { /*Metodo main declarado en Principal*/
        
        Persona vendedor = new Persona();
        Persona cliente = new Persona();
        Articulo art1 = new Articulo();
        Venta venta1 = new Venta();
        //per.pedirDatos();//Llamamamos a la funcion pedirDatos disponible de la clase persona
        //per.mostrarDatos();//Llamamamos a la funcion MostrarDatos disponible de la clase persona
        // Instanciamos a la clase Articulo
        
        //float calcularSubtotal;
        //calcularSubtotal = venta1.calcularSubtotal(art1.cantidad, art1.precio);
        //System.out.println("El subtotal es $" + calcularSubtotal);
        // MENU DE OPCIONES CON DO
        int opcion;
        do{
            System.out.flush();
            Menu menu1 = new Menu();
            menu1.mostarMenu();
            System.out.println("INGRESE SU OPCION: ");
            Scanner opc = new Scanner(System.in);
            opcion = opc.nextInt();
            
            switch (opcion){
                case 1:
                    vendedor.pedirDatosEmpleado();
                    cliente.pedirDatosCliente();
                    art1.pedirArt();
                    vendedor.mostrarDatos();
                    venta1.calcularSubtotal(art1.getCantidad(), art1.getPrecio());
                    cliente.mostrarDatos();
                    venta1.mostrarFactur();
                    break;
                case 2:
                    vendedor.pedirDatosEmpleado();
                    cliente.pedirDatosCliente();
                    vendedor.mostrarDatos();
                    cliente.mostrarDatos();
                    break;
                case 3:
                    System.out.println("NADA POR AQUI TODAVIA...");
                    break;
                default:
                    System.out.println("ERROR, ELIJA UNA OPCION VALIDA...");
                    break;
            }
        }while(opcion != 4);
    }
}