package Taller_4_2_POO;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
    public CuentaBancaria(){
        
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria" + "\nnumeroCuenta:" + numeroCuenta + "\n saldo:" + saldo + "\n tipoCuenta:" + tipoCuenta ;
    }
    
}

