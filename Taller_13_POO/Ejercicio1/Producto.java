package Ejercicio1;
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public double aplicarDescuento(Descuento descuento) {
        return descuento.aplicarDescuento(precio);
    }


    public double getPrecio() {
        return precio;
    }


    public String getNombre() {
        return nombre;
    }
}
