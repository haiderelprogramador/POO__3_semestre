
package Taller_3_1_POO;

public class Producto {
    String nombre;
    int precio;
    int stock; 


    public Producto() {
    }

    
    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public void mostrarInfo() {
        System.out.println("Nombre:"+nombre+"\nPrecio:"+precio+"\nStock:"+stock);
    }
}



