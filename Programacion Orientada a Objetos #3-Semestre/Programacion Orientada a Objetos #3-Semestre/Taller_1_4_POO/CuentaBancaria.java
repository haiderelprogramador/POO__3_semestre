package Taller_1_4_POO;

public class CuentaBancaria {

    String numeroCuenta;
    String tipoCuenta;
    int saldo;
    public CuentaBancaria(){
        this.numeroCuenta="1234567890";
        this.tipoCuenta="ahorro";
        this.saldo=4578;
    
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    public CuentaBancaria(String numeroCuenta,String tipoCuenta){
    this.numeroCuenta=numeroCuenta;
    this.tipoCuenta=tipoCuenta;
    
    }

    @Override
    public String toString() {
        return "CuentaBanco: " + "\nnumeroCuenta: " + numeroCuenta + " '\ntipoCuenta: " + tipoCuenta + "\n saldo: " + saldo;
    }
}
