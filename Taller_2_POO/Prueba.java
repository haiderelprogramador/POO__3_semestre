
package Taller_2_POO;


public class Prueba {
    String prueba;
    public Prueba(){
        
    }
    

    public Prueba(String prueba) {
        this.prueba = prueba;
    }
    
    void  Example(){
        System.out.println("Prueba:"+prueba);
    /*   System.out.println("Prueba:"+this.prueba);
    non-static variable this cannot be referenced from a static context*/
    }
    
}
