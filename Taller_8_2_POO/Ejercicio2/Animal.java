package Taller_8_2_POO.Ejercicio2;

public class Animal {
    private String Especie;

    public Animal(String Especie){
        this.Especie=Especie;

    }

    public void MostrarEspecie(){
        System.out.println("La especie es : " + Especie);
        
    }
}
