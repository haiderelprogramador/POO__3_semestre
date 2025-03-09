package Taller_8_POO.Ejercicio_1;

public class Vehiculo {
    public String Marca;
    public double MaxumaVelocidad;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getMaxumaVelocidad() {
        return MaxumaVelocidad;
    }

    public void setMaxumaVelocidad(double maxumaVelocidad) {
        MaxumaVelocidad = maxumaVelocidad;
    }

    public Vehiculo(String Marca, double MaxumaVelocidad){
    this.Marca=Marca;
    this.MaxumaVelocidad=MaxumaVelocidad;
    }

    public void MostrarInformacion(){
        System.out.println("La marca del carro es : "+ Marca);
        System.out.println("La maxima velocidad de ese carro es de : "+ MaxumaVelocidad + "Km/h") ;
    }    
}
