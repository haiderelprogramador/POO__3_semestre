package Taller_8_2_POO.Ejercicio1;

public class Empleado extends Persona {
    private String Departamento;

    public Empleado(String Nombre, int edad, String Departamento){
        super(Nombre, edad);
        this.Departamento=Departamento;
    }

    @Override
    public void MostrarDetalles(){
    super.MostrarDetalles();
    System.out.println("El departamento es : " + Departamento);
    }
    
}
