package Taller_14_POO.Ejercicio3;

public class Bicicleta extends Transporte {
    @Override
    public void mover(int distancia) {
        System.out.println("La bicicleta se mueve " + distancia + " km.");
    }
}