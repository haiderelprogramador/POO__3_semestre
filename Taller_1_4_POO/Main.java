package Taller_1_4_POO;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);


    Libro libro=new Libro("Mbappe","Messi",11);
    System.out.println(libro);
    CuentaBancaria cuentabancaria=new CuentaBancaria("1231111110","ahorro",4828);
    System.out.println(cuentabancaria);
    Estudiantes estudiantes=new Estudiantes("Juanito",19,"11");
    System.out.println(estudiantes); 
    System.out.println("*");
    System.out.println("Digite el nombre del libro:");
    String nombrecito=scanner.nextLine();
    System.out.println("Digite el autor :");
    String autorr=scanner.nextLine();
    System.out.println("Digite el numero de paginas:");
    int numeroPaginitas=scanner.nextInt();
    
    Libro librito=new Libro();
    librito.titulo=nombrecito;
    librito.autor=autorr;
    librito.numeroPaginas=numeroPaginitas;
    Libro lb=new Libro(nombrecito,autorr,numeroPaginitas);
    System.out.println(lb);
    System.out.println("*");
    System.out.println("Digite el tipo de cuenta:");
    String tipocuentaa=scanner.next();
    System.out.println("Digite el numero de cuenta:");
    String numerocuenta=scanner.next();
    System.out.println("Digite el saldo:");
    int saldo=scanner.nextInt();
    
    CuentaBancaria cuentabanco=new CuentaBancaria();
    cuentabanco.tipoCuenta=tipocuentaa;
    cuentabanco.numeroCuenta=numerocuenta;
    cuentabanco.saldo=saldo;
    CuentaBancaria cb=new CuentaBancaria(numerocuenta,tipocuentaa,saldo);
    System.out.println(cb);
    System.out.println("*");
    Estudiantes estudiantess=new Estudiantes();
    
    System.out.println("Digite el nombre del estudiante:");
    String nombre=scanner.next();
    System.out.println("Digite el curso del estudiante:");
    String curso=scanner.next();
    System.out.println("Digite la edad del estudiante:");
    int edad=scanner.nextInt();
    
    estudiantess.nombre=nombre;
    estudiantess.curso=curso;
    estudiantes.edad=edad;
    
    Estudiantes Es=new Estudiantes(nombre,edad,curso);
    System.out.println(Es);

    scanner.close();
    }
}
