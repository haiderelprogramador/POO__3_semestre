package Taller_17_POO.Ejercicio3;

class Coche extends Transporte {
    @Override
    public void avanzar() {
        System.out.println("El coche está avanzando con el motor encendido.");
    }

    @Override
    public void detener() {
        System.out.println("El coche se ha detenido.");
    }

    public void encenderMotor() {
        System.out.println("El motor del coche está encendido.");
    }
}
