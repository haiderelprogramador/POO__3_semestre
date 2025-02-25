package Taller_8_POO.Ejercicio_3;

public class Gerente extends Empleado {
    private String Departamento;

    public Gerente(String Nombre, int salario, String Departamento){
        super(Nombre, salario);
        this.Departamento=Departamento;
    }

    @Override
    public void MostrarDetalles(){
        super.MostrarDetalles();
        System.out.println("El departamento es : " + Departamento);
    }
}
