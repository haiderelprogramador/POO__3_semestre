package Taller_19_POO.Ejercicio2;

public class GestordeArchivos {
    private Almacenamiento almacenamiento;

    public GestordeArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String nombreArchivo) {
        almacenamiento.guardar(nombreArchivo);
    }

    public void recuperarArchivo(String nombreArchivo) {
        almacenamiento.recuperar(nombreArchivo);
    }
}
