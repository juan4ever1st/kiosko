
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
                    System.out.println("****************************************************************************");
                    System.out.println("\nVENDEDOR: ");
                    vendedor.mostrarDatos(); // Llamamamos a la funcion MostrarDatos disponible de la clase persona
                    venta1.calcularSubtotal(art1.getCantidad(), art1.getPrecio());
                    System.out.println("\nDATOS CLIENTE:");
                    cliente.mostrarDatos();
                    hoy.mostrarFecha();
                    System.out.println("****************************************************************************");
                    System.out.println("                                                                            ");
                    System.out.println("Cod_Art__________Cantidad__________Descripción__________PrecioUnitario");
                    System.out.println(art1.getCodigo()+"          "+art1.getCantidad()+"          "+art1.getDescripcion()+"               "+art1.getPrecio());
                    venta1.mostrarFactura();
                    System.out.println("*****************************************************************************\n\n");
                    break;
                }
                case 2:
                {
                    vendedor.pedirDatosEmpleado();
                    cliente.pedirDatosCliente();
                   
                    System.out.println("CUANTOS ARTICULOS DESEA INGRESAR? ");
                    
                    Scanner respuesta = new Scanner(System.in);
                    int cantArt = respuesta.nextInt();
                    
                    Articulo array[] = new Articulo[cantArt];
                        
                    System.out.println("INGRESE LOS ARTICULOS: \n");
                    for(int i = 0; i < cantArt; i++){  
                        Articulo art = new Articulo();
                        art.pedirArt();
                        array[i] = art;
                    }
                    
                    System.out.println("****************************************************************************");
                    System.out.println("\nVENDEDOR: ");
                    vendedor.mostrarDatos(); // Llamamamos a la funcion MostrarDatos disponible de la clase persona
                    System.out.println("\nDATOS CLIENTE:");
                    cliente.mostrarDatos();
                    hoy.mostrarFecha();
                    System.out.println("****************************************************************************");
                    System.out.println("                                                                            ");
                    System.out.println("Cod_Art__________Cantidad__________Descripción__________PrecioUnitario");
                    for(int i = 0; i<cantArt; i++){
                        System.out.println(array[i].getCodigo()+"          "+array[i].getCantidad()+"          "+array[i].getDescripcion()+"               "+array[i].getPrecio());
                        venta1.calcularSubtotal(array[i].getCantidad(), array[i].getPrecio());
                    }
                    venta1.mostrarFactura();
                    System.out.println("*****************************************************************************\n\n");
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