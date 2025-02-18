package Taller_1_4_POO;

public class Estudiantes {
    String nombre;
    String  curso;
    int edad;
    public Estudiantes(){
        this.nombre="pepito";
        this.curso="B2";
        this.edad=12;
    
    }
    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiantes(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso= curso;
    }

    @Override
    public String toString() {
        return "Estudiantes: " + "\nnombre: " + nombre + "\n curso: " + curso + "\n edad: " + edad ;
    }
}
