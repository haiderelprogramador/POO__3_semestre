package Ejercicio2;

public class Documento_word extends Documento {
    public Documento_word(String contenido) {
        super(contenido);
    }


    public void exportarAWord() {
        System.out.println("Exportando a Word: " + getContenido());
    }
}
