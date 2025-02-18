package Taller_1_4_POO;
import java.util.*;

public class Pelicula {
    Scanner scanner = new Scanner(System.in);

    public String Nombre_pelicula ="";
    public String Genero_pelicula ="";
    public int Duracion;
    public String Idioma_pelicula="";


    public String getNombre_pelicula() {
        return Nombre_pelicula;
    }
    public void setNombre_pelicula(String nombre_pelicula) {
        Nombre_pelicula = nombre_pelicula;
    }
    public String getGenero_pelicula() {
        return Genero_pelicula;
    }
    public void setGenero_pelicula(String genero_pelicula) {
        Genero_pelicula = genero_pelicula;
    }
    public int getDuracion() {
        return Duracion;
    }
    public void setDuracion(int duracion) {
        Duracion = duracion;
    }
    public String getIdioma_pelicula() {
        return Idioma_pelicula;
    }
    public void setIdioma_pelicula(String idioma_pelicula) {
        Idioma_pelicula = idioma_pelicula;
    }


    public Pelicula(String Nombre_pelicula, String Genero_pelicula, int Duracion, String Idioma_pelicula){
    this.Nombre_pelicula = Nombre_pelicula;
    this.Genero_pelicula = Genero_pelicula;
    this.Duracion =Duracion;
    this.Idioma_pelicula=Idioma_pelicula;
    }

    public void PedirPeli(){
        System.out.println("Digite el nombre de la pelicula : ");
        Nombre_pelicula = scanner.next();
        System.out.println("Digite el genero de la pelicula : ");
        Genero_pelicula = scanner.next();
        System.out.println("Digite la duracion de la pelicula(en minutos) : ");
        Duracion = scanner.nextInt();
        System.out.println("Digite el idioma de la pelicula : ");
        Idioma_pelicula = scanner.next();
    }

    

    @Override
    public String toString() {
        return "Detalles Pelicula = " + "Nombre :" + Nombre_pelicula + "," + "Genero :" + Genero_pelicula + "," + "Duracion :" + Duracion + "," + "Idioma :" + Idioma_pelicula;
    }
}


