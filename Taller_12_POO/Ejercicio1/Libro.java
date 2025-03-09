package Taller_12_POO.Ejercicio1;

public class Libro {
    private String Titulo;
    private String AñodePublicacion;
    private String Autor;

    public Libro(String titulo, String añodePublicacion, String autor) {
        this.Titulo = titulo;
        this.AñodePublicacion = añodePublicacion;
        this.Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAñodePublicacion() {
        return AñodePublicacion;
    }

    public void setAñodePublicacion(String añodePublicacion) {
        AñodePublicacion = añodePublicacion;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    
}
