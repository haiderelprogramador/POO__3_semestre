package Taller_12_POO.Ejercicio1;

public class LibroReporterGenerator {
    
    public void GenerarReportes(Libro libro){
        System.out.println("Reporte del libro");
        System.out.println();
        System.out.println("Titulo : "+ libro.getTitulo());
        System.out.println("Autor : "+ libro.getAutor());
        System.out.println("Año de Publicacion : "+libro.getAñodePublicacion());
    }
}
