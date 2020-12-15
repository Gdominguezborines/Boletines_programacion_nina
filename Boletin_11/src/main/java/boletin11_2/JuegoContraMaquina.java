/**
 * 2-	Programa o exercicio  anterior para xogar contra o ordenador .
 * Para eso, o ordenador xenera un número aleatorio, entre 1 e 50 ,.Este
 * programa dará as seguintes pistas sobre lonxe que esté de adivinar o número :
 * Se a distancia entre o número a adivinar e o tecleado é maior de 20  “
 * moi lonxe “
 * Entre 10 e 20 , ambos incluidos,  lonxe
 * Maior de 10 e menor de 5  preto
 * Menor ou igual de 5  moi preto .    
 */
package boletin11_2;
 
import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class JuegoContraMaquina {
   
 
   private int numeroAleatorio;
   private int numero_elegido;
 
  
    public void aleatorio(){
       int a;
       int b;
   
       
     // numeroAleatorio=(int)(Math.random()*(50-1+1)+1);
        numeroAleatorio=50;  
           //   System.out.println(numeroAleatorio);
       
             do{
           
        numero_elegido=Integer.parseInt(JOptionPane.showInputDialog(null,"Jugador  \nIntroduce el numero que crees que puso la maquina"));
      
        a=numero_elegido-numeroAleatorio;
        b=numeroAleatorio-numero_elegido;
           System.out.println(a+"  y  "+b);
                
                
         if(a >20 || b >20){
                      
              JOptionPane.showMessageDialog(null,"moi lonxe");
            }    
            else if(b <=20 && b >=10 || a <=20 && a >=10){
                       
              JOptionPane.showMessageDialog(null,"lonxe");
            }
            else if (b <10 && b >5 || a <10 && a >5) {
              JOptionPane.showMessageDialog(null,"preto");
                 
            }
            else if(a <=5 && numeroAleatorio!=numero_elegido  ||b <=5 && numeroAleatorio!=numero_elegido ){
                        
              JOptionPane.showMessageDialog(null,"moi preto");
                        
            }
            else if(numeroAleatorio==numero_elegido){
            
              JOptionPane.showMessageDialog(null,"Felicidades acertaste");
              
            }
      
                 
             }while(numeroAleatorio!=numero_elegido);
            
    }
}
    
    
    
   
    
     

  
  
  