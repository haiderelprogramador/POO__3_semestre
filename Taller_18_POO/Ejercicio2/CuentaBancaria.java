package Taller_18_POO.Ejercicio2;

public class CuentaBancaria implements Pagable, Retirable, Transferible {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void transferir(double monto, String cuentaDestino) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Transferencia de " + monto + " a la cuenta " + cuentaDestino);
        } else {
            System.out.println("Fondos insuficientes para la transferencia.");
        }
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de " + monto);
        } else {
            System.out.println("Fondos insuficientes para el retiro.");
        }
    }

    @Override
    public void pagarFactura(String facturaId, double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Pago de factura " + facturaId + " por " + monto);
        } else {
            System.out.println("Fondos insuficientes para pagar la factura.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
