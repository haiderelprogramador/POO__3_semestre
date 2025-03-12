package Taller_14_POO.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {
    private double limiteRetiroMensual;
    private double retiradoEsteMes;

    public CuentaAhorros(double saldoInicial, double limiteRetiroMensual) {
        super(saldoInicial);
        this.limiteRetiroMensual = limiteRetiroMensual;
        this.retiradoEsteMes = 0;
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo && (retiradoEsteMes + monto) <= limiteRetiroMensual) {
            saldo -= monto;
            retiradoEsteMes += monto;
        } else {
            throw new IllegalArgumentException("Monto inválido, saldo insuficiente o límite de retiro mensual excedido.");
        }
    }

    public void reiniciarRetirosMensuales() {
        retiradoEsteMes = 0;
    }
}
