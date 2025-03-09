package Taller_7_POO.Ejercicio_1;

public abstract class Figura {

    public abstract double CalcularArea();

    public void ImprimirArea(){
        System.out.println("El area de la figura es : " + CalcularArea());
    }
    
        
    
}