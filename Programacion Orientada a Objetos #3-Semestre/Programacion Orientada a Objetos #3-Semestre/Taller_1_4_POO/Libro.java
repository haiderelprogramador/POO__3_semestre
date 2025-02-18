package Taller_1_4_POO;

public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;


    public Libro(){
        this.titulo="tomate";
        this.autor="toto";
        this.numeroPaginas=8;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro:" + "\ntitulo:" + titulo + ",\nautor:" + autor + "\nnumeroPaginas:" + numeroPaginas;

}
}
