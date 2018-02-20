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
public class ejercicio2 {
    

    public static void main(String[] args) {
       
       Scanner variable = new Scanner(System.in);
  
       int pregunta;
       int nota,promedio,acumuladorNota=0;
       
      
       
       while (true==true){
       System.out.println("Digite el numero de mes, el cual desea saber su estacion ");
       pregunta = variable.nextInt();
       
       while(pregunta<=0 || pregunta>12 ){
           System.out.println("Digite por favor un mes valido");
           pregunta = variable.nextInt();
       }
       if (pregunta==1 || pregunta==2 || pregunta==3){
           System.out.println("la estacion del mes es invierno");
       }else{
           if(pregunta==4 || pregunta==5 || pregunta==6){
               System.out.println("la estacion del mes es verano");
           }else{
               if(pregunta==7 || pregunta==8 || pregunta==9){
                  System.out.println("la estacion del mes es otoño");
               }else{
                   if(pregunta==10 || pregunta==11 || pregunta==12){
                     System.out.println("la estacion del mes es primavera");
                   }
               }
           }
       }
       
       }
    }
}
    