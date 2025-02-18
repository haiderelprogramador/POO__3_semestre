package Taller_1_3_POO;

public class Estudiante {
    String Nombre_estudiante= "Raul";
    int edad=18;
    String Curso="11";



    public Estudiante(String Nombre_estudiante, int edad){
        this.Nombre_estudiante = Nombre_estudiante;
        this.edad = edad;
    }

    public Estudiante(String Nombre_estudiante, int edad, String Curso){
        this(Nombre_estudiante, edad);
        this.Curso = Curso;
        this.Nombre_estudiante = Nombre_estudiante;
        this.edad = edad;
    }

    public void MostrarEstudiante(){
        System.out.println("---------Datos de estudiante--------");
        System.out.println("* Nombre = "+Nombre_estudiante);
        System.out.println("* Edad = " + edad);
        System.out.println("* Curso = " + Curso);
    }
}
