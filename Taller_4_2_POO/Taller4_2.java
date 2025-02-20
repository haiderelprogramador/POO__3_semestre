package Taller_4_2_POO;

public class Taller4_2 {

    public static void main(String[] args) {
    Empleado empleado=new Empleado();
    empleado.setNombre("Manuel");
    empleado.setSalario(10000);
    System.out.println("Nombre:"+empleado.getNombre()+"\nSalario:"+empleado.getSalario());
        System.out.println("***********************************");
        CuentaBancaria cuentabancaria=new CuentaBancaria();
        cuentabancaria.setNumeroCuenta("635255192");
        cuentabancaria.setSaldo(18000);
        cuentabancaria.setTipoCuenta("ahorro");
        System.out.println(cuentabancaria);
    System.out.println("***********************************");
    int numero1=10;
    int numero2=2;
    System.out.println("suma:"+Utilidades.Suma(numero1,numero2));
    System.out.println("Resta:"+Utilidades.Resta(numero1,numero2));
    System.out.println("Multiplicacion:"+Utilidades.Multiplicacion(numero1,numero2));
    System.out.println("Division:"+Utilidades.Division(numero1,numero2));
    }
    
}
