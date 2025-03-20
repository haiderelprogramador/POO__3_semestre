package Taller_19_POO.Ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento{
    @Override
    public void guardar(String nombreArchivo) {
        System.out.println("Guardando archivo localmente: " + nombreArchivo);
    }

    @Override
    public void recuperar(String nombreArchivo) {
        System.out.println("Recuperando archivo localmente: " + nombreArchivo);
    }
}
