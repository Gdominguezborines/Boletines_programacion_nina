
package MiCalculadora;

import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class calculadora {
    
    private float num1,num2,num3,respuesta;

  /*  public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
*/
  
    public float pedirNumeros1(){
        
        num1=Float.parseFloat(JOptionPane.showInputDialog(null,"Inserte el primer numero","Numeros decimales separados con punto",2));
        
        return num1;
    } 
    public float pedirNumeros2(){
        
        num2=Float.parseFloat(JOptionPane.showInputDialog(null,"Inserte el segundo numero","Numeros decimales separados con punto",2));
        
        return num2;
    } 
    
    
    
    
    public void calculadora(){
    


      
        do {            
            
          
      num1=pedirNumeros1();
      num2=pedirNumeros2();
      num3=num1+num2;
      if(num1>0&& num2>0){
    
          String[] botones = {"Sumar", "Restar", "Multiplicar", "Dividir","Resto","Raiz cuadrada"};
    
                int ventana = JOptionPane.showOptionDialog(null,"Pulsa un boton para realizar laoperacion deseada:","Elige tu opcion:",0,3, null,botones, botones[0]);
                //System.out.println(ventana);
 
                if(ventana == 0){ 
                    JOptionPane.showMessageDialog(null,"La suma es "+(num1+num2));
                }
                else if(ventana == 1){
                    JOptionPane.showMessageDialog(null,"La resta es "+(num1-num2));
                }
                else if(ventana == 2){
                    JOptionPane.showMessageDialog(null,"La multiplicacion es "+(num1*num2));
                }
                else if(ventana == 3){
                    JOptionPane.showMessageDialog(null,"La division es "+(num1/num2));
                }
                else if(ventana == 4){
                    JOptionPane.showMessageDialog(null,"El Resto es "+(num1%num2));
                }
                else if(ventana == 5){
                    
                    JOptionPane.showMessageDialog(null,"Laraiz cuadrada de la suma de "+num1+" y "+num2+" es de "+(Math.sqrt(num3)));
                }
      }
      else{
            JOptionPane.showMessageDialog(null, "ERROR!!!!!! Escribe numeros mayores a 0 ", "No tienes ni idea de usar una calculadora", 0);
      
      }
           
                   respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres volver a ejecutar la calculadora?", "Elige tu opcion", JOptionPane.YES_NO_OPTION,3);
                   if(respuesta==1){
                       respuesta=JOptionPane.showConfirmDialog(null, "¿Estas seguro?", "Elige tu opcion", JOptionPane.YES_NO_OPTION,3);
                       if(respuesta==0){
                           respuesta=1;
                       }
                       else{
                           respuesta=0;
                       }
                   }
   
             } while (respuesta ==0);
    
  
        
        
        
  /*       
       
          
        do {            
            
          
      num1=pedirNumeros1();
      num2=pedirNumeros2();
      num3=num1+num2;
      if(num1>0&& num2>0){
    
    String[] botones = {"Sumar", "Restar", "Multiplicar", "Dividir","Resto"};
    
    int ventana = JOptionPane.showOptionDialog(null,"Pulsa un boton para realizar laoperacion deseada:","Elige tu opcion:",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null,botones, botones[0]);
        //System.out.println(ventana);
        
    
        
        switch (ventana) {
            case 0:
                JOptionPane.showMessageDialog(null,"La suma es "+(num1+num2));
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"La resta es "+(num1-num2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"La multiplicacion es "+(num1*num2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"La division es "+(num1/num2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"El Resto es "+(num1%num2));
                break;
            default:
                break;
                 
        }
         }
      else{
            JOptionPane.showMessageDialog(null, "ERROR!!!!!! Escribe numeros mayores a 0 ", "No tienes ni idea de usar una calculadora", 0);
           
      }
           
                   respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres volver a ejecutar la calculadora?", "Elige tu opcion", JOptionPane.YES_NO_OPTION,3);
     
   
             } while (respuesta ==0);
    
 */
    
    
    
    
 }  

}





 
