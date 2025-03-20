package Taller_18_POO.Ejercicio2;

public interface OperacionBancaria {
    void transferir(double monto, String cuentaDestino);
    void retirar(double monto);
    void pagarFactura(String facturaId, double monto);
}
