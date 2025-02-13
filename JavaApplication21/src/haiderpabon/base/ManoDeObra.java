/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haiderpabon.base;

import java.util.Date;


public class ManoDeObra {
   private Empleado trabajador;
   private Proyecto proyecto;
   private Date FechaInicio;
   private Date FechaFin;
   private String rol; 
   
   public ManoDeObra(){
   
   }
   public ManoDeObra(Empleado e, Proyecto p){
       trabajador = e;
       proyecto = p;
   }
}
