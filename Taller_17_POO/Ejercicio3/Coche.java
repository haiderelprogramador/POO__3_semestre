package Taller_17_POO.Ejercicio3;

class Bicicleta extends Transporte {
    @Override
    public void avanzar() {
        System.out.println("La bicicleta está avanzando pedaleando.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se ha detenido.");
    }
}

