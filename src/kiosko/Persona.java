package kiosko;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Persona {
    private String nombre;//atributo privado string
    private String cuil;//atributo privado string

    public void pedirDatos(){//Creamos la operacion pedirDatos
        System.out.println("Ingrese el nombre: ");
        Scanner nom = new Scanner(System.in);//Usamos la clase Scanner, creamos el objeto nom de tipo scanner
        this.nombre = nom.nextLine();//almacenamos en nombre: el dato recogido por la funcion de Scanner
        System.out.println("Ingrese el N° de CUIL: ");
        Scanner numcuil = new Scanner(System.in);
        this.cuil = numcuil.nextLine();
    }
    public void mostrarDatos(){//creamos la funcion mostraDatos que imprime las variables golbales: nombre y cuil
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su CUIL es: "+cuil);
    }
}