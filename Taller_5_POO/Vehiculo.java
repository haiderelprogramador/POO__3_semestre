package Taller_5_POO;

public class Vehiculo {
    protected  String tipo;
    protected String marca;
    Vehiculo(){
        
    }

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
    public void detalles(){
        System.out.println("Tipo:"+tipo);
        System.out.println("Marca:"+marca);
    }
    
    
}
