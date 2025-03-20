package Taller_18_POO.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        Transferible transferible = cuenta;
        transferible.transferir(200, "123456789");

        Retirable retirable = cuenta;
        retirable.retirar(100);

        Pagable pagable = cuenta;
        pagable.pagarFactura("CB-001", 150);

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
