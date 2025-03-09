package Taller_12_POO.Ejercicio3;

public class UsuarioAutenticacion {
    public boolean autenticar(Usuario usuario, String contraseñaIngresada){
    return usuario.getContraseña().equals(contraseñaIngresada);
    }
}
