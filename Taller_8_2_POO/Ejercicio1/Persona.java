package Taller_8_2_POO.Ejercicio1;

public class Persona {
    private String Nombre;
    private int edad;

    public Persona(String Nombre, int edad){
        this.Nombre=Nombre;
        this.edad=edad;
    }

    public void MostrarDetalles(){
        System.out.println("El nombre es : " + Nombre);
        System.out.println("La edad es : " + edad);
    }
}
