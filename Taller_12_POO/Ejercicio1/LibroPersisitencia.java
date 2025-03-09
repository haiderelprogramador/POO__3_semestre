package Taller_12_POO.Ejercicio1;

public class LibroPersisitencia {
        public void guardarLibro(Libro libro, String archivo) {
            System.out.println("Guardando libro en el archivo: " + archivo);
            System.out.println("Libro guardado: " + libro.getTitulo() + " por " + libro.getAutor());
        }
    
        public Libro cargarLibro(String archivo) {
            System.out.println("Cargando libro desde el archivo: " + archivo);
            return new Libro("100 años de seriedad", "2018", "Mbappe");
        }
    }

