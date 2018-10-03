package kiosko;

public class Venta {
    public float cantidad;
    public float subtotal;
    public float precio;

    public float calcularSubtotal(float cantidad, float precio){
        subtotal = cantidad * precio;
        return subtotal;
    }
    
    public void mostrarFactur(){
        System.out.println("EL TOTAL A PAGAR ES: $" + subtotal);
    }
}