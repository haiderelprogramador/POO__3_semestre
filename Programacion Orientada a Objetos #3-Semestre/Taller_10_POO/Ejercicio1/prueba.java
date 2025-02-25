package Taller_10_POO.Ejercicio1;

public class prueba {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 6);
        Triangulo triangulo = new Triangulo(3, 8);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
