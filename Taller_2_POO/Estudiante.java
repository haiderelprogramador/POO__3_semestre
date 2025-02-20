
package Taller_2_POO;

public class Estudiante {
    String nombre;
    int edad;
    
    public Estudiante(){
        this("Haider",18);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }public void detallesEstudiantes(){
            System.out.println("Nombre:"+nombre+"\nedad:"+edad);
    }

    
}
