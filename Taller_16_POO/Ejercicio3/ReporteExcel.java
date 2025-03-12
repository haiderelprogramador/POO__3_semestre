package Taller_16_POO.Ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte en formato Excel...");
        System.out.println("Contenido del reporte Excel:\n" + datos);
    }
}
