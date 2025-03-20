package Taller_18_POO.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion(1000);

        Conducible conducible = camion;
        conducible.conducir();

        TrnasportadordeMercancia transportador = camion;
        transportador.cargarMercancias(500);

        System.out.println("Carga actual: " + camion.getCargaActual() + " kg");
    }
}
