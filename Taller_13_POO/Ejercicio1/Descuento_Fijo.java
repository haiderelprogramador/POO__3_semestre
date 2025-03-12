package Ejercicio1;
public class Descuento_Fijo extends Descuento {
    private double montoFijo;

    public Descuento_Fijo(double montoFijo) {
        super(0); 
        this.montoFijo = montoFijo;
    }


    @Override
    public double aplicarDescuento(double precio) {
        return precio - montoFijo;
    }
}
