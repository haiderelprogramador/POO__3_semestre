package Taller_19_POO.Ejercicio1;

public class AuntenticacioLocal implements ServicioAuntenticacion{
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Simulación de autenticación local
        return "admin".equals(usuario) && "1234".equals(contraseña);
    }
}
