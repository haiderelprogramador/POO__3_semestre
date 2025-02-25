package Taller_7_POO.Ejercicio_2;

public class Gerente extends Empleado{
    private double salarioBase;
    private double bono;

    public Gerente(String Nombre, String id, double salarioBase, double bono){
        super(Nombre, id);

        this.salarioBase=salarioBase;
        this.bono=bono;
        
    }
    @Override
    public double calcularSalario(){
        return salarioBase+bono;
    }
    
}
