package Taller_19_POO.Ejercicio2;

import Taller_16_POO.Ejercicio2.GestorArchivos;

public class Main {
    public static void main(String[] args) {
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestordeArchivos gestorLocal = new GestordeArchivos(almacenamientoLocal);

        gestorLocal.guardarArchivo("archivo_local.txt");
        gestorLocal.recuperarArchivo("archivo_local.txt");

        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestordeArchivos gestorNube = new GestordeArchivos(almacenamientoNube);

        gestorNube.guardarArchivo("archivo_nube.txt");
        gestorNube.recuperarArchivo("archivo_nube.txt");
    }
}
