
package Taller_3_1_POO;


public class Vehiculos extends Vehiculo {

    public Vehiculos() {
    }

    public Vehiculos(String tipo) {
        super(tipo);
    }

    @Override
    public String toString() {
        return "Vehiculos:"+tipo;
    }
    
}

