package Taller_16_POO.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Simulación de autenticación local
        return "admin".equals(usuario) && "1234".equals(contraseña);
    }
}