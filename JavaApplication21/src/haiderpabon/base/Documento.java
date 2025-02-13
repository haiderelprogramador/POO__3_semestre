
package haiderpabon.base;

import java.util.List;


public class Documento {
  private String codigo;
  private String descripcion;
  private String tipo;
  private Tarea tarea;
  private List<Version> listaDeVersiones;
  
public Documento(){
    
}
public Documento(String codigo, String descrip){
    this.codigo=codigo;
    this.descripcion=descrip;
}
  
}
