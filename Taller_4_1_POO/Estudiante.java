package Taller_4_1_POO;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    public Estudiante(){
    
    }

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+")) {
        this.nombre = nombre;
        }else{
            System.out.println("El nombre solo puede contener letras");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        if(edad<=0){
        } else{
            System.out.println("edad no puede ser negativa ");
        }
    }

    public double getPromedio() {
        return promedio;
        
    }

    public void setPromedio(double promedio) {
    if(promedio<0 && promedio>5){
        this.promedio = promedio;
    }else{
        System.out.println("El promedio no puede ser menor a 0 y mayor a cinco ");
    }
    }
    }
