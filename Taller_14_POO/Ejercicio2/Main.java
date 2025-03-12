package Taller_14_POO.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuentaNormal = new CuentaBancaria(2000);
        cuentaNormal.depositar(700);
        cuentaNormal.retirar(500);
        System.out.println("Saldo de la cuenta normal: " + cuentaNormal.getSaldo());

        
        CuentaAhorros cuentaAhorros = new CuentaAhorros(2000, 500);
        cuentaAhorros.depositar(800);
        cuentaAhorros.retirar(600); 
        System.out.println("Saldo de la cuenta de ahorros: " + cuentaAhorros.getSaldo());

        
        try {
            cuentaAhorros.retirar(200); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        cuentaAhorros.reiniciarRetirosMensuales();
        cuentaAhorros.retirar(200); 
        System.out.println("Saldo de la cuenta de ahorros después del reinicio: " + cuentaAhorros.getSaldo());
    }
}
