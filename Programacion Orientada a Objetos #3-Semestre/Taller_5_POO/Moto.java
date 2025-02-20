package Taller_5_POO;

public class Moto extends Vehiculo{
    private  String cilindrada;

    public Moto(String cilindrada, String tipo, String marca) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void detalles() {
        super.detalles(); 
        System.out.println("Cilindrada:"+cilindrada);
    }

}
