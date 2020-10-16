/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

import java.util.Scanner;

/**
 *
 * @author cambes
 */
public class boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Fai un programa , para o software dunha máquina, que converta 
        una cantidade enteira de diñeiro, que está en billetes de 100, 20, 5 
        e moedas de 1 € , no seu equivalente en euros ( exp.  2 billetes de
                100, 3 -> 20 , 6 moedas de 1  visualizaríamos 266 € ).  */
        
        
        float dinero;
        float b100=200;
        float b20=60;
        float m1=6;
              
         dinero=b100+b20+m1;  // Realizo operacciones
             
        System.out.println("El total es de  ="+dinero);  // Muestro el resultado
              
    }
    
}
