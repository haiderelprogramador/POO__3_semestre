package Taller_17_POO.Ejercicio2;

class CuentaAhorros extends CuentaBancaria {
    private static final int LIMITE_RETIROS = 3; 
    private int retirosRealizados;

    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
        this.retirosRealizados = 0;
    }

    @Override
    public void retirar(double monto) {
        if (retirosRealizados >= LIMITE_RETIROS) {
            System.out.println("Límite de retiros alcanzado. No se puede retirar más dinero.");
        } else if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            retirosRealizados++;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto inválido o saldo insuficiente.");
        }
    }

    public void calcularInteres(double tasa) {
        if (tasa > 0) {
            double interes = saldo * tasa / 100;
            saldo += interes;
            System.out.println("Interés aplicado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La tasa de interés debe ser positiva.");
        }
    }
}