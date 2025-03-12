package Taller_16_POO.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Simulación de autenticación OAuth
        return "user@oauth.com".equals(usuario) && "oauth123".equals(contraseña);
    }
}