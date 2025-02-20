package Taller_6_POO;

public class Taller6 {

    public static void main(String[] args) {
    Coche coche=new Coche("Honda","civic");
        System.out.println(coche);
      coche.mostrarContador();
      System.out.println("********************************");
        int resultadoSuma=Matematica.Suma(8, 5);
        int resultadoResta=Matematica.Resta(1, 7);
        int resultadoMultiplicacion=Matematica.Multiplicacion(9, 11);
        int resultadoDivision=Matematica.Division(15, 25);
        System.out.println("Suma:"+resultadoSuma);
        System.out.println("Resta:"+resultadoResta);
        System.out.println("Multiplicacion:"+resultadoMultiplicacion);
        System.out.println("Division:"+resultadoDivision);
        System.out.println("********************************");
        Persona persona=new Persona("Haider",18);
        System.out.println(persona);    }
    
}
