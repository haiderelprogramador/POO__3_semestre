
package Taller_3_1_POO;


public class Prueba {
    public static void main(String[]args){
    Producto pruebaproducto=new Producto("PC",1000000,15);
    pruebaproducto.mostrarInfo();
    
    Persona persona=new Persona();
    persona.setNombre("Ronaldo");

    /* persona.edad(12);
    cannot find symbol
    symbol:   method edad(int)
    location: variable persona of type Persona*/

    
    persona.setEdad(130);
        System.out.println(persona);

    
    }
    
}
