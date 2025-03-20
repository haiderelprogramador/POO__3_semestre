package Taller_19_POO.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);

        gestorPDF.generar("Reporte_Ventas_Q1");

        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);

        gestorExcel.generar("Reporte_Ventas_Q2");
    }
}
