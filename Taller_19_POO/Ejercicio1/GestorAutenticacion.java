package Taller_19_POO.Ejercicio1;

import Taller_16_POO.Ejercicio1.ServicioAutenticacion;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean iniciarSesion(String usuario, String credencial) {
        return servicioAutenticacion.autenticar(usuario, credencial);
    }
}
