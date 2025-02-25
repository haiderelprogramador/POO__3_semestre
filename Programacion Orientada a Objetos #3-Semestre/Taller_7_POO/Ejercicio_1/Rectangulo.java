package Taller_7_POO.Ejercicio_1;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.altura=altura;
        this.base=base;
    }
    @Override
    public double CalcularArea(){
        return base*altura;
    }
    
}
