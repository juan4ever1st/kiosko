
package kiosko;

import java.util.Scanner;

public class KioskoApp {
    public static void main(String[] args) { /*Metodo main declarado en Principal*/
        //Instanciamos nuevos objetos de la clases persona, articulo y venta
        Persona vendedor = new Persona();
        Persona cliente = new Persona();
        Articulo art1 = new Articulo();
        Venta venta1 = new Venta();
        Fecha hoy = new Fecha();

        // MENU DE OPCIONES CON DO
        int opcion;
        do{
            System.out.flush();
            Menu menu1 = new Menu();
            menu1.mostrarMenu();
            System.out.println("INGRESE SU OPCION: ");
            Scanner opc = new Scanner(System.in);
            opcion = opc.nextInt();
            
            switch (opcion){
                case 1:
                {
                    vendedor.pedirDatosEmpleado(); //Llamamamos a la funcion pedirDatos disponible de la clase persona
                    cliente.pedirDatosCliente();
                    art1.pedirArt();
                    System.out.println("\nVENDEDOR: ");
                    vendedor.mostrarDatos(); // Llamamamos a la funcion MostrarDatos disponible de la clase persona
                    venta1.calcularSubtotal(art1.getCantidad(), art1.getPrecio());
                    System.out.println("\nDATOS CLIENTE:");
                    cliente.mostrarDatos();
                    hoy.mostrarFecha();
                    venta1.mostrarFactura();
                    System.out.println("Cod_Art__________Cantidad__________Descripción__________PrecioUnitario");
                    System.out.println(art1.getCodigo()+"          "+art1.getCantidad()+"          "+art1.getDescripcion()+"               "+art1.getPrecio());
                    System.out.println("\n\n");
                    break;
                }
                case 2:
                {
                    int cantArt = 0;
                    int respuesta;
                    do{
                        System.out.println("DESEA INGRESAR OTRO ARTICULO? 1-SI, 0-NO.");
                        Scanner resp = new Scanner(System.in);
                        respuesta = resp.nextInt();
                        
                        while(0 != respuesta){
                            vendedor.pedirDatosEmpleado();
                            cliente.pedirDatosCliente();
                            vendedor.mostrarDatos();
                            cliente.mostrarDatos();
                        }
                    }while(0 != respuesta);
                    break;
                }
                case 3:
                {
                    System.out.println("NADA POR AQUI TODAVIA...");
                    break;
                }
                case 4:
                {
                    System.out.println("GRACIAS POR UTILIZAR LA APP...");
                }
                default:
                {
                    System.out.println("ERROR, ELIJA UNA OPCION VALIDA...\n\n");
                    break;
                }
            }
        }while(opcion != 4);
    }
}