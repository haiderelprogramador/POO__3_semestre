package Taller_12_POO.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Producto producto = new Producto("Celular", 500.0, 6);

    ProductoEtiquetaGenerator etiquetaGenerator = new ProductoEtiquetaGenerator();
    String etiqueta = etiquetaGenerator.generarEtiqueta(producto);
    System.out.println("Etiqueta del producto: " + etiqueta);

    ProductoPrecioCalculator precioCalculator = new ProductoPrecioCalculator();
    double precioTotal = precioCalculator.calcularPrecioTotal(producto);
    System.out.println("Precio total: $" + precioTotal);
    }
    
}

