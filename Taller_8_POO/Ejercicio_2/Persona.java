package Taller_8_POO.Ejercicio_2;

public class Persona {
    private int edad;
    private String Nombre;

    public Persona(int edad,String Nombre){
        this.Nombre=Nombre;
        this.edad=edad;
    }

    public void MostrarInformacion(){
        System.out.println("Nombre : " + Nombre);
        System.out.println("Edad : " + edad);
    }
}
