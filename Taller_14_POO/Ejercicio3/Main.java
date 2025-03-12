package Taller_14_POO.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        
        Transporte[] transportes = new Transporte[2];
        transportes[0] = bicicleta;
        transportes[1] = coche;

        for (Transporte transporte : transportes) {
            transporte.mover(120); 
        }
    }
}
