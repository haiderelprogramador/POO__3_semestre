package Taller_12_POO.Ejercicio3;

public class UsuarioValidacion {
    public boolean validar(Usuario usuario) {
        return usuario.getNombre() != null && !usuario.getNombre().isEmpty() &&
            usuario.getEmail() != null && usuario.getEmail().contains("@") &&
            usuario.getContraseña() != null && usuario.getContraseña().length() >= 8;
    }
}
