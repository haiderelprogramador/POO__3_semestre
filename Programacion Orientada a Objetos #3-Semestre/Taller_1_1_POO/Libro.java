package Taller_1_1_POO;

public class Libro {
    
        String Autor ;
        String numero_de_paginas;
        String Titulo ;


        public Libro(){
            Autor = "Raul";
            numero_de_paginas = "101";
            Titulo = "100 años de seriedad";
        }

        public Libro(String Autor, String numero_de_paginas, String Titulo){
        this.Autor =Autor;
        this.Titulo=Titulo;
        this.numero_de_paginas=numero_de_paginas;
        }
        public void ver_propiedades_Libro(){
            System.out.println(" Autor = " + Autor + " Titulo del libro = " + Titulo +"  Numero de paginas del libro = " + numero_de_paginas );
        }


}
