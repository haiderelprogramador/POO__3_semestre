package Taller_4_2_POO;

public class Empleado {
    private  String nombre;
    public int salario;
    public Empleado(){
    
    }

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+")) {
        this.nombre = nombre;
        }else{
            System.err.println("El nombre no puede contener numeros ");
    }
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if(salario>=0){
        this.salario = salario;
        }else{
            System.out.println("El saldo debe ser mayor a cero ");
        }
    }

}
