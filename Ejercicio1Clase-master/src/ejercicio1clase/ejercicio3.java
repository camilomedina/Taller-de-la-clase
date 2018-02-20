/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1clase;
import java.util.Scanner;
/**
 *
 * @author Familia Díaz Rendón
 */
public class ejercicio3 {
        public static void main(String[] args) {
       
       Scanner variable = new Scanner(System.in);
  
       int pregunta;
      
       
      
       
       while (true==true){
       System.out.println("Digite el numero de años que posee actualmente ");
       pregunta = variable.nextInt();
       
       while(pregunta<0){
           System.out.println("Digite por favor sus años validos");
           pregunta = variable.nextInt();
       }
       if (pregunta>0 || pregunta<6 ){
           System.out.println("eres de la clase pre-infantil");
       }else{
           if(pregunta>7 || pregunta<17){
               System.out.println("eres de la clase infantil");
           }else{
               if(pregunta>18 || pregunta<25){
                  System.out.println("eres de la clase juvenil");
               }else{
                   if(pregunta>26 || pregunta<59){
                     System.out.println("eres de la clase mayores");
                   }
                   else{
                       if(pregunta>60){
                           System.out.println("eres de la clse veteranos");
                       }
                   }
               }
           }
       }
       
       }
    
}
}