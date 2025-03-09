package Taller_7_POO.Ejercicio_1;

public class Circulo extends Figura {
    private double radio;

    public Circulo (double radio){
        this.radio = radio;

    }

    @Override
    public double CalcularArea(){
        return Math.PI*radio*radio;
    }

    
}
