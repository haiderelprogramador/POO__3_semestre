package Taller_15_POO.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Reparacion tecnico = new Tecnico();
        Limpieza limpieza = new empleadoLimpieza();

        tecnico.repara();
        limpieza.limpia();
    }
}