package Taller_16_POO.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);

        gestorPDF.generar("Datos del reporte en PDF");

        
        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);

        gestorExcel.generar("Datos del reporte en Excel");
    }
}
