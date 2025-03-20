package Taller_19_POO.Ejercicio2;

public class AlmacenamientoNube implements Almacenamiento{
    @Override
    public void guardar(String nombreArchivo) {
        System.out.println("Guardando archivo en la nube: " + nombreArchivo);
    }

    @Override
    public void recuperar(String nombreArchivo) {
        System.out.println("Recuperando archivo desde la nube: " + nombreArchivo);
    }
}
