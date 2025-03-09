package Taller_12_POO.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Haider", "Haider32108@gmail.com", "32108");

        UsuarioValidacion usuV = new UsuarioValidacion();
        boolean es_valido = usuV.validar(usuario);
        System.out.println("El usuario es valido?"+es_valido);

        UsuarioAutenticacion usuA = new UsuarioAutenticacion();
        boolean estaAuntenticado = usuA.autenticar(usuario, "32108");
        System.out.println("El usuario esta auntenticado?" + estaAuntenticado);
    }
}
