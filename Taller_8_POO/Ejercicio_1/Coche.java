package Taller_8_POO.Ejercicio_1;

class Coche extends Vehiculo {

    private int NumeroDePuertas;

    public Coche(String Marca, double MaxumaVelocidad, int NumeroDePuertas ){
        super(Marca, MaxumaVelocidad);
        this.NumeroDePuertas=NumeroDePuertas;


    }

    @Override

    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("Numero de puertas del auto : " + NumeroDePuertas );
    }
}