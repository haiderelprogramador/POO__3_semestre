package Taller_18_POO.Ejercicio3;

public class Camion implements Conducible, TrnasportadordeMercancia, Vehiculo {
    private double capacidadCarga;
    private double cargaActual;

    public Camion(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = 0;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión...");
    }

    @Override
    public void cargarMercancias(double peso) {
        if (cargaActual + peso <= capacidadCarga) {
            cargaActual += peso;
            System.out.println("Cargando " + peso + " kg de mercancías.");
        } else {
            System.out.println("No se puede cargar, excede la capacidad máxima.");
        }
    }

    public double getCargaActual() {
        return cargaActual;
    }
}
