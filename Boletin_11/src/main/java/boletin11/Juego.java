/**
*Codifica un programa que permita o seguinte xogo  para adiviñar un número .
* O primeiro xogador  teclea ( utilizando a clase JoptionPane ), un número a adiviñar 
* ( entre 1 e 50 ) e o número máximo de intentos que ten o segundo xogador para dar 
* con el . O programa irá sacando por pantaia mensaxes que orienten o segundo xogador
* sobre se o número tecleado e maior ou menor que o número a adiviñar . 
* Fai o programa repetitivo.
*/
package boletin11;

import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class Juego {
   
   private int numero;
   private int numero_elegido;
   private int intentos;
   private int contador;
  
   
    public void adivinar(){
      
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Jugador 1 \nIntroduce numero entre el 1 y el 50"));
   
        }while(numero>50 && numero<1);
    
            intentos=Integer.parseInt(JOptionPane.showInputDialog(null,"Jugador 1 \nIntroduce numero de intentos para que adivine el jugador 2"));
            contador=intentos;
            for(int i=0;i<intentos; i++){
              
              //  System.out.println(i);
              //  System.out.println(contador);
                
                numero_elegido=Integer.parseInt(JOptionPane.showInputDialog(null,"Jugador 2 \nIntroduce el numero que crees que puso jugador 1"));
                    if(numero_elegido>numero){
                       contador--;
                        JOptionPane.showMessageDialog(null,"El numero elegido:\nEs mayor que el de jugador 1\nTe quedan "+contador+" intentos");
                    }    
                    else if(numero>numero_elegido){
                        contador--;
                        JOptionPane.showMessageDialog(null,"El numero elegido \nEs menor que el de jugador 1\nTe quedan "+contador+" intentos");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Felicidades!!!!!!! as ganado \nTe sobraron "+contador+" intentos\nFin del juego");
                        break;
                    }
                    
            
            }
    }
    
    
    
    
    
    
    
    
    
}
