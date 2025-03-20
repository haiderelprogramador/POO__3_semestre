package Taller_19_POO.Ejercicio3;

public class ReporteExcel implements GeneradorReporte{
    @Override
    public void generarReporte(String nombreReporte) {
        System.out.println("Generando reporte en formato Excel: " + nombreReporte);
    }
}
