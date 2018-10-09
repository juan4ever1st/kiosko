package kiosko;
import java.util.Scanner;

public class Persona {
    private String nombre;//atributo privado string
    private String cuil;//atributo privado string

    Persona() {
    }
    
    //Creamos la operacion pedirDatos para el empleado vendedor
    public void pedirDatosEmpleado(){
        System.out.println("INGRESE SU NOMBRE DE VENDEDOR: ");
        Scanner nom = new Scanner(System.in);//Usamos la clase Scanner, creamos el objeto nom de tipo scanner
        this.nombre = nom.nextLine();//almacenamos en nombre: el dato recogido por la funcion de Scanner
        System.out.println("INGRESE NUMERO DE CUIL o CUIT: ");
        Scanner numcuil = new Scanner(System.in);
        this.cuil = numcuil.nextLine();
    }
    //Creamos la operacion pedirDatos para el cliente
    public void pedirDatosCliente(){
        System.out.println("INGRESE EL NOMBRE DEL CLIENTE: ");
        Scanner nom = new Scanner(System.in);//Usamos la clase Scanner, creamos el objeto nom de tipo scanner
        this.nombre = nom.nextLine();//almacenamos en nombre: el dato recogido por la funcion de Scanner
        System.out.println("INGRESE NUMERO DE CUIL o CUIT DEL CLIENTE: ");
        Scanner numcuil = new Scanner(System.in);
        this.cuil = numcuil.nextLine();
    }
    //Creamos la funcion mostraDatos que imprime las variables globales: nombre y cuil
    public void mostrarDatos(){
        System.out.println("NOMBRE: "+nombre);
        System.out.println("CUIL: "+cuil);
    }
    // metodo constructor de la clase persona
    public Persona (String nombre, String cuil){
        this.nombre = nombre;
        this.cuil = cuil;
        //Tambien se lo puede inicilizar con datos fijos
        //this.nombre = "Juan Carlos Olazo"
        //this.cuil = 20-30801932-3
    }
    //Getter, metodo para obtener el nombre de la persona en el objeto persona
    public String getNombre(){
        return nombre;
    }
    //Setter, metodo para asignar nombre persona al objeto persona
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Getter, metodo para obtener el CUIL de la persona en el objeto persona
    public String getCuil(){
        return cuil;
    }
    //Setter, metodo para obtener asignar el CUIL a cuil en el objeto persona
    public void setCuil(String cuil){
        this.cuil = cuil;
    }
}