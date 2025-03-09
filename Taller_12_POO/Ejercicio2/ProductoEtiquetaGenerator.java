package Taller_12_POO.Ejercicio2;

public class ProductoEtiquetaGenerator {
    public String generarEtiqueta(Producto producto) {
        return "Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio() + ", Cantidad: " + producto.getCantidad();
    }
}
