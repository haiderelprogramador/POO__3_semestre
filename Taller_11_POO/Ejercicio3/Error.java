package Taller_11_POO.Ejercicio3;

public class Error {
    public static void main(String[] args) {
        deporte otro = new otrodeporte();

        otro.mostrardeporte(); // si compila
        //otro.mostrarotrodeporte(); = muestra error de compilacion
        //The method mostrarotrodeporte() is undefined for the type deporte en pocas palabras no se puede llamar al otro metodo por el simple echo de que no esta implementadoe en la clase padre
    }
}
