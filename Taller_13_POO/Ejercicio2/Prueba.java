package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {

        Documento documentoPdf = new Documento("Contenido del documento PDF");
        documentoPdf.exportarAPdf();


        Documento_word documentoWord = new Documento_word("Contenido del documento Word");
        documentoWord.exportarAWord();


        Documento_excel documentoExcel = new Documento_excel("Contenido del documento Excel");
        documentoExcel.exportarAExcel();
    }
}
