
package Taller_2_POO;

public class Taller2 {

    public static void main(String[] args) {
        Producto producto=new Producto("Papa",2500);
        producto.mostrarProducto();
        System.out.println("----------------------------------");
        Estudiante estudiantes=new Estudiante();
        estudiantes.detallesEstudiantes();
        System.out.println("-----------------------------------");
        Prueba prueba=new Prueba("PSG");
        prueba.Example();
        
        
    }
    
}
