/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_2_POO;

public class Producto {
    String nombre;
    int precio;
    
    public Producto(){
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrarProducto(){
        System.out.println("nombre:"+nombre+"\nprecio:"+precio);
    }
    
    
}
