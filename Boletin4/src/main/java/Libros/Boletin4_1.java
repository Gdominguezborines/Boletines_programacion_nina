package Libros;

import java.util.Scanner;


public class Boletin4_1 {

 
    public static void main(String[] args) {
        // TODO code application logic here
  
    //metodo para introducir datos
     Scanner sc =new Scanner(System.in);
             
     
        System.out.println("Escribe titulo del libro= ");
        String t=sc.nextLine();
        System.out.println("Escribe autor del libro= ");
        String Au=sc.nextLine();
        System.out.println("Escribe ano del libro= ");
        int A=sc.nextInt();
        System.out.println("Escribe numero de paginas del libro= ");
        short Np=sc.nextShort();
        System.out.println("Escribe valoracion del libro enforma numerica del 0 al 10 siendo 10 la mejor= ");
        float Va=sc.nextFloat();
        
     System.out.println("El libro="+t+" ,"+Au+" ,"+A+" ,"+Np+" ,"+Va+".");
     
          
        
      Libro obxLibro =new Libro();
       obxLibro.amosar();
        
        Libro obxLibro1 =new Libro("noche oscura ","pepe ",2019,(short)540,5f);
         obxLibro1.amosar();
    
        String respuesta=obxLibro1.getTitulo();
        System.out.println("El titulo es"+respuesta);
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
