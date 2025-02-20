package Taller_6_POO;

public class Coche {
    private String marca;
    private String modelo;
    static int contadorCoches=0;
    public Coche(){
    
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }
    public static void mostrarContador() {
        System.out.println("Numero de coches creados: " + contadorCoches);
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }  
    
}
