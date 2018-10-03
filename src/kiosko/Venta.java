package kiosko;

public class Venta {
    public float cantidad;
    public float subtotal;
    public float precio;

    public float calcularSubtotal(float cantidad, float precio){
        subtotal = cantidad * precio;
        return subtotal;
    }
}