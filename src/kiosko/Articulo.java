package kiosko;

import java.util.Scanner;

public class Articulo {
    int codigo;
    String descripcion;
    float precio;
    int cantidad;
    
    /**
     *Pedimos los datos del articulo
     */
    public void pedirArt(){
        System.out.println("Ingrese el codigo del articulo: ");
        Scanner code = new Scanner(System.in);
        this.codigo = code.nextInt();
        System.out.println("Ingrese la descripcion del art.: ");
        Scanner descrip = new Scanner(System.in);
        this.descripcion = descrip.nextLine();
        System.out.println("Indique el precio del producto: ");
        Scanner preciounit = new Scanner(System.in);
        this.precio = preciounit.nextFloat();
        System.out.println("¿Cual es la cantidad?: ");
        Scanner cant = new Scanner(System.in);
        this.cantidad = cant.nextInt();
    }
    // Creando metodo get
    int getCodigo(){
        return this.codigo;
    }
    String getDescripcion(){
        return this.descripcion;
    }
    float getPrecio(){
        return this.precio;
    }
    int getCantidad(){
        return this.cantidad;
    }
    //Creando metodos set
    void setCodigo(int C){
        this.codigo = C;
    }
    void setDescripcion(String D){
        this.descripcion = D;
    }
    void setPrecio(float P){
        this.precio = P;
    }
    void setCantidad(int _Can){
        this.cantidad = _Can;
    }
}
