package Taller_8_POO.Ejercicio_3;

public class Empleado {
    private String Nombre;
    private int salario;

    public Empleado(String Nombre, int salario){
        this.Nombre=Nombre;
        this.salario=salario;

    }

    public void MostrarDetalles(){
        System.out.println("El nombre es : " + Nombre);
        System.out.println("El salario es : " + salario);
    }
}
