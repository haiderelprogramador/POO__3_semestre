package Ejercicio1;
public class Prueba {
    public static void main(String[] args) {
        
        Producto producto = new Producto("Celular", 5000.0);

        
        Descuento descuentoPorcentaje = new Descuento(20);
        double precioConDescuentoPorcentaje = producto.aplicarDescuento(descuentoPorcentaje);
        System.out.println("Precio con descuento del 20%: $" + precioConDescuentoPorcentaje);

        
        Descuento descuentoFijo = new Descuento_Fijo(300); 
        double precioConDescuentoFijo = producto.aplicarDescuento(descuentoFijo);
        System.out.println("Precio con descuento fijo de $300: $" + precioConDescuentoFijo);
    }
}
