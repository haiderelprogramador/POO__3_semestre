package Taller_12_POO.Ejercicio3;

public class Usuario {
    private String nombre;
    private String Email;
    private String contraseña;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario(String nombre, String Email, String contraseña){
        this.Email=Email;
        this.contraseña=contraseña;
        this.nombre=nombre;
    }

    

    
}
