package Taller_17_POO.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaAhorros(15000);
        cuenta.consultarSaldo();
        cuenta.depositar(1000);
        cuenta.retirar(500);
        cuenta.consultarSaldo();
    }
}
