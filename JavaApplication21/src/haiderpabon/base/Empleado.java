
package haiderpabon.base;

import java.util.Date;
import java.util.List;


public class Empleado {
  protected String dni;
  protected String nombre;
  protected String apellidos;
  protected String direccion;
  protected String telefono;
  protected String email;
  protected Date fechaContrato;
  protected Empresa empresa;
  protected List<Tarea> listaDeTareas;
  
  
  public Empleado(){
  
  }
  public Empleado(String apellido, String nombre){
      this.nombre=nombre;
      this.apellidos=apellido;
  
  }
}
