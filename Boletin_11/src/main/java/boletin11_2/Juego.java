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





/**
 * @author cambes
 */
public class Juego {
    
    public static void main(String[] args) {
        

 JuegoContraMaquina juego = new JuegoContraMaquina();
 
 juego.aleatorio();
        
}
}