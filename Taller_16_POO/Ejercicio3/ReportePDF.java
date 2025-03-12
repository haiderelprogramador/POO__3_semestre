package Taller_16_POO.Ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte en formato PDF...");
        System.out.println("Contenido del reporte PDF:\n" + datos);
    }
}