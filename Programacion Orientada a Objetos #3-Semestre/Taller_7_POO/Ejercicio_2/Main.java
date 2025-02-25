package Taller_7_POO.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("haider","G001",10000,1.5);
        gerente.mostraDetalles();

        Empleado vendedor = new Vendedor("Camilo","V002",15000.0,0.5); 
        vendedor.mostraDetalles();
            
    }
}
