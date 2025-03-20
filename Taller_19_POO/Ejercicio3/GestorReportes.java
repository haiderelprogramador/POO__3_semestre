package Taller_19_POO.Ejercicio3;

public class GestorReportes {
    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void generar(String nombreReporte) {
        generadorReporte.generarReporte(nombreReporte);
    }
}
