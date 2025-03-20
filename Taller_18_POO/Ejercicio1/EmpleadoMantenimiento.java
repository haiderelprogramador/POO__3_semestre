package Taller_18_POO.Ejercicio1;

public class EmpleadoMantenimiento implements Mantenimiento{
    @Override
    public void reparar(){
        System.out.println("El sistema esta en reparacion");
    }

    @Override
    public void limpiar(){
        System.out.println("El sistema esta siendo limpiado");
    }
}
