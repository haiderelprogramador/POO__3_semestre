package Taller_14_POO.Ejercicio3;

public class Coche extends Transporte {
    @Override
    public void mover(int distancia) {
        System.out.println("El coche se mueve " + distancia + " km.");
    }
}
