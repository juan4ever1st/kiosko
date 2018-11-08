package kiosko;

/**
*
*/

public class Venta {
    public float cantidad;
    public float subtotal;
    public float precio;

    public float calcularSubtotal(float cantidad, float precio){
        subtotal = subtotal + cantidad * precio;
        return subtotal;
    }
    public Venta(){ // Constructor sin parametros
        cantidad = 0;
        subtotal = 0;
        precio = 0;
    }

    public void mostrarFactura(){
        System.out.println("EL TOTAL A PAGAR ES:                           $" + subtotal);
    }
}