package Taller_7_POO.Ejercicio_2;

public abstract class Empleado {
    private String Nombre;
    private String id;

    public Empleado(String Nombre, String id){
        this.Nombre=Nombre;
        this.id=id;
    }
    
    public abstract double calcularSalario();

    public void mostraDetalles(){
        System.out.println("El nombre es : " + Nombre);
        System.out.println("La identificacion es : " + id);
        System.out.println("Salario = "+ calcularSalario());
    }
}
