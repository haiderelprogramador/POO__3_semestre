package Taller_9_POO.Ejercicio2;

public class Pez implements Nadador,Respirador {
    @Override

    public void Nadar(){
        System.out.println("El pez esta nadando");
    }

    @Override
    public void respirar(){
        System.out.println("El pez esta respirando");
    }
}
