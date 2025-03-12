package Ejercicio2;

public class Documento_excel extends Documento {
    public Documento_excel(String contenido) {
        super(contenido);
    }


    public void exportarAExcel() {
        System.out.println("Exportando a Excel: " + getContenido());
    }
}
