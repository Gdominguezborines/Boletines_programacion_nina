/* - Temos a seguinte clase Coche:

public class Coche {
     private int velocidade ;

    public Coche(){
    velocidade =0 ;
}

Engade a clase Coche os seguintes métodos :

public int getVelocidade() . Este método devolve a velocidade actual

public void acelerar (int valor) .Este método incrementa a velocidade na cantidade valor

public void frenar (int menos).Este método diminue a velocidade na cantidade menos.

Crea a clase Boletin 6_1 para comprobar que o programa se executa ben .dandolle os valores que precises.
*/


package boletin6;

import java.util.Scanner;


public class Boletin6_1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner sc =new Scanner(System.in);
     
    System.out.println("Escribe los velocidad= ");
         int v=sc.nextInt();
     
      Coche coche2 =new Coche( v);
     
        System.out.println("La velocidad es de ="+coche2.getVelocidade());
      
     
     coche2.Acelerar(v);
     coche2.Frenar(v);
     
     
    
    }
    
}
