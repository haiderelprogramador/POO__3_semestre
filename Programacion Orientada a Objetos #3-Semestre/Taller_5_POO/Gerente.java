package Taller_5_POO;

public class Gerente extends Empleado {
    private String departamento;
    public Gerente(){
        
    }

    public Gerente(String departamento, String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Departamento:"+departamento);
        
    }
}
