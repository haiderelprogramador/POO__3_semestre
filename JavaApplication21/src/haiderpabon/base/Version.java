
package haiderpabon.base;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Version {
  private Date fecha;
  private String descripcion;
  private File archivo;
  private List<Version> listaDeVersiones;
  private Documento documento; 
  
  public Version(){
  }
  public Version(Date fecha, String d){
      fecha=fecha;
      descripcion=d;
  }
}
