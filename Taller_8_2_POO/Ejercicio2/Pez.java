package Taller_8_2_POO.Ejercicio2;

public class Pez extends Animal {
    private String TipoDeAgua;

    public Pez(String Especie, String TipoDeAgua){
        super(Especie);
        this.TipoDeAgua=TipoDeAgua;
    }

    @Override
    public void MostrarEspecie(){
        super.MostrarEspecie();
        System.out.println("El tipo de agua del pez es : " + TipoDeAgua);
    }
    
}
