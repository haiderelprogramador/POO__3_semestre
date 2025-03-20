package Taller_19_POO.Ejercicio1;

import Taller_16_POO.Ejercicio1.AutenticacionLocal;
import Taller_16_POO.Ejercicio1.AutenticacionOAuth;
import Taller_16_POO.Ejercicio1.ServicioAutenticacion;

public class Main {
    public static void main(String[] args) {
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);

        boolean resultadoLocal = gestorLocal.iniciarSesion("admin", "1234");
        System.out.println("Autenticación local: " + (resultadoLocal ? "Éxito" : "Fallo"));

        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);

        boolean resultadoOAuth = gestorOAuth.iniciarSesion("usuario_oauth", "token_valido");
        System.out.println("Autenticación OAuth: " + (resultadoOAuth ? "Éxito" : "Fallo"));
    }
}
