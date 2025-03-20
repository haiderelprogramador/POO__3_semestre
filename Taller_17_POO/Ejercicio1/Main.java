package Taller_17_POO.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(10, 7);

        circulo.calcularArea();
        rectangulo.calcularArea();
    }
}
