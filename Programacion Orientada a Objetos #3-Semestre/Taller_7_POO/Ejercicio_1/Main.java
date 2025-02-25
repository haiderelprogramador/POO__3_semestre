package Taller_7_POO.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        circulo.ImprimirArea();

        Figura rectangulo = new Rectangulo(10, 6);
        rectangulo.ImprimirArea();
    }
}
