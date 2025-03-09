package Taller_8_POO.Ejercicio_4;

public class Derivada extends Base {
    public Derivada(int valor) {
        super(valor);
    }

    public void intentarAcceder() {
        // Esto causará un error de compilación
        System.out.println(atributoPrivado);
    }
}
