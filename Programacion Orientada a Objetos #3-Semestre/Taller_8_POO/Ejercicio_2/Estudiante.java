package Taller_8_POO.Ejercicio_2;

public class Estudiante extends Persona {
    private String Matricula;

    public Estudiante(int edad, String Nombre, String Matricula){
        super(edad, Nombre);
        this.Matricula=Matricula;
    }
    @Override

    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("La matricula es : " + Matricula);
    }
}
