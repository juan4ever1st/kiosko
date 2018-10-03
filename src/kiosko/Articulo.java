package kiosko;

import java.util.Scanner;

public class Articulo {
    private int codigo;
    private String descripcion;
    private float precio;
    private int cantidad;

    Articulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *Pedimos los datos del articulo
     */
    public void pedirArt(){
        System.out.println("INGRESE EL CODIGO DEL ARTICULO: ");
        Scanner code = new Scanner(System.in);
        this.codigo = code.nextInt();
        System.out.println("DESCRIPCION DEL ARTICULO: ");
        Scanner descrip = new Scanner(System.in);
        this.descripcion = descrip.nextLine();
        System.out.println("INDIQUE PRECIO UNITARIO DEL ART.: ");
        Scanner preciounit = new Scanner(System.in);
        this.precio = preciounit.nextFloat();
        System.out.println("INGRESE LA CANTIDAD: ");
        Scanner cant = new Scanner(System.in);
        this.cantidad = cant.nextInt();
    }
    // Metodo constuctor
    public Articulo(int codigo, String descripcion, float precio, int cantidad){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
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
