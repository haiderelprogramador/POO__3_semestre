package Taller_9_POO.Ejercicio3;

interface Volador {
    void volar();
}

class Pato implements Volador {
    @Override
    public void volar() {
        System.out.println("El pato está volando");
    }
}

class Perro implements Volador {
    @Override
    public void volar() {
        // ¿Un perro puede volar? Esto no tiene sentido.
        throw new UnsupportedOperationException("Los perros no pueden volar");
    }
}
