package Taller_17_POO.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        System.out.println("--- Bicicleta ---");
        bicicleta.avanzar();
        bicicleta.detener();

        System.out.println("--- Coche ---");
        coche.avanzar();
        coche.detener();
    }
}
