package Taller_16_POO.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);

        boolean resultadoLocal = gestorLocal.iniciarSesion("admin", "123456");
        System.out.println("Autenticación local: " + (resultadoLocal ? "Éxito" : "Fallo"));

        
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);

        boolean resultadoOAuth = gestorOAuth.iniciarSesion("haider@gmail.com", "haider123");
        System.out.println("Autenticación OAuth: " + (resultadoOAuth ? "Éxito" : "Fallo"));
    }
}
