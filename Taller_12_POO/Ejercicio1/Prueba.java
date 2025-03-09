package Taller_12_POO.Ejercicio1;

public class Prueba {
        public static void main(String[] args) {
            
            Libro libro = new Libro("100 años de seriedad", "2018", "Mbappe");
    
            
            LibroReporterGenerator reporteGenerator = new LibroReporterGenerator();
            reporteGenerator.GenerarReportes(libro);
    
            
            LibroPersisitencia persistencia = new LibroPersisitencia();
            persistencia.guardarLibro(libro, "libros.txt");
    
        
            Libro libroCargado = persistencia.cargarLibro("libros.txt");
            reporteGenerator.GenerarReportes(libroCargado);
        }
}
