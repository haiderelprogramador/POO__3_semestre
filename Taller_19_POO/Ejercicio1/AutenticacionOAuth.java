package Taller_19_POO.Ejercicio1;

import Taller_16_POO.Ejercicio1.ServicioAutenticacion;

public class AutenticacionOAuth implements ServicioAuntenticacion {
    @Override
    public boolean autenticar(String usuario, String token) {
        return "usuario_oauth".equals(usuario) && "token_valido".equals(token);
    }
}