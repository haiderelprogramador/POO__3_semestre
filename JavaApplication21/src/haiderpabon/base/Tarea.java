
package haiderpabon.base;

import java.util.Date;
import java.util.List;

public class Tarea {
   private String descripcion;
   private String tipo;
   private Date fechaInicioEstimado;
   private Date fechaInicioReal;
   private int duracionEstimada;
   private int duracionReal;
   private List<Empleado> listaDeEmpleados;
   private Proyecto proyecto;
   private List<Documento> listaDeDocumentos; 
   
   public Tarea(){
   
   }
   public Tarea(String d, String t){
   descripcion = d;
   tipo= t;
   }
}
