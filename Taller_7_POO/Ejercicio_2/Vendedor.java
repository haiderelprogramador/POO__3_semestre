package Taller_7_POO.Ejercicio_2;

public class Vendedor extends Empleado{
    private double ventasTotales;
    private double comicionporVenta;

    public Vendedor(String Nombre, String id, Double ventasTotales, double comicionporVenta){
        super(Nombre, id);
        this.comicionporVenta=comicionporVenta;
        this.ventasTotales=ventasTotales;

    }
    @Override
    public double calcularSalario(){
        return ventasTotales*comicionporVenta;
    }
    
}
