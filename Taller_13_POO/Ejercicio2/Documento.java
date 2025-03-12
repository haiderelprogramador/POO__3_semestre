package Ejercicio2;

public class Documento {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }


    public void exportarAPdf() {
        System.out.println("Exportando a PDF: " + contenido);
    }


    public String getContenido() {
        return contenido;
    }
}
