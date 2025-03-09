package Taller_9_POO.Ejercicio1;

public class Ave implements Cantante,Volador {
    @Override

    public void volar(){
        System.out.println("El ave esta volando");
    }

    @Override

    public void cantar(){
        System.out.println("El ave esta cantando ");
    }
}
