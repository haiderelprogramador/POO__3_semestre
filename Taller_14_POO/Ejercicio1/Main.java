package Taller_14_POO.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        
        Figura circulo = new Circulo(8.0);
        System.out.println("Área del círculo: " + circulo.calcularArea());

        
        Figura rectangulo = new Rectangulo(9.0, 4.0);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        
        Figura[] figuras = new Figura[2];
        figuras[0] = circulo;
        figuras[1] = rectangulo;

        for (Figura figura : figuras) {
            System.out.println("Área de la figura: " + figura.calcularArea());
        }
    }
}