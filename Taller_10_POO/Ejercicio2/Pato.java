package Taller_10_POO.Ejercicio2;

public class Pato implements Volador,Nadador{
    @Override
    public void nadar(){
    System.out.println("El pato nada");
    }
    @Override
    public void volar(){
    System.out.println("El pato vuela");
    }
    
}
