package Taller_16_POO.Ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Guardando archivo '" + nombreArchivo + "' en la nube...");
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        System.out.println("Recuperando archivo '" + nombreArchivo + "' desde la nube...");
        return "Contenido simulado del archivo " + nombreArchivo;
    }
}
