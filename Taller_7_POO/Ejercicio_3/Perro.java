package Taller_7_POO.Ejercicio_3;

public abstract class Perro  {
    
        
public abstract void accion();

public class Perro_accion extends Perro {
    @Override
    public void accion() {
        System.out.println("El perro dice: ¡Guau guau!");
    
}
//es una mala practica hacerlo de esta manera


}
}
