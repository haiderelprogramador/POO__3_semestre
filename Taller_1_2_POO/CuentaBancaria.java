package Taller_1_2_POO;

public class CuentaBancaria {
    String Numero_de_cuenta;
    int saldo;
    String Tipo_de_cuenta;

    public CuentaBancaria(){
        Numero_de_cuenta = "123456";
        saldo = 10000;
        Tipo_de_cuenta = "Cuenta de ahorros";
    }

    public CuentaBancaria(String Numero_de_cuenta, String Tipo_de_cuenta){
        this.Numero_de_cuenta = Numero_de_cuenta;
        this.Tipo_de_cuenta = Tipo_de_cuenta;
    }

    public CuentaBancaria(String Numero_de_cuenta, String Tipo_de_cuenta, int saldo){
        this.Numero_de_cuenta =Numero_de_cuenta;
        this.Tipo_de_cuenta = Tipo_de_cuenta;
        this.saldo = saldo;
    }

    public void Detalles_de_cuenta(){
    System.out.println("-------Detalles de cuenta---------");
    System.out.println("----------------------------------");
    System.out.println("Numero de cuenta = "+ Numero_de_cuenta);
    System.out.println("Tipo de cuenta = "+ Tipo_de_cuenta);
    System.out.println("Saldo = " + saldo);
    }
}
