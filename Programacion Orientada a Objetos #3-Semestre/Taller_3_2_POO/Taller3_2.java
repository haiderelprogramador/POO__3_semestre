package Taller_3_2_POO;

public class Taller3_2 {


    public static void main(String[] args) {
  
      
      Vehiculo vehiculo=new Vehiculo();
      Vehiculo bicicleta=new Bicicleta();
        bicicleta.moverse();
      /*  @Override
          public void Derivada(){
              System.err.println("La integral no es");
          }modifier public not allowed here 'void' type not allowed here Variable Derivada is neither read or written to*/
        System.out.println("***************************");
      Derivada derivada=new pruebaDerivada();
      derivada.Derivada(2);
    
    }
    
}
