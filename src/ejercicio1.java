
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ejercicio1 {
    
        
        // TODO code application logic here
     public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        String nombre;
        int nota;
        int i=0,pregunta,promedio,acumulado=0;
     
        // TODO code application logic here
        System.out.println("digite su nombre ");
        nombre=dato.next();
        
        System.out.println("digite la cantidad de notas que desea");
        pregunta=dato.nextInt();
        while(pregunta<=0){
            System.out.println("la cantidad de notas no puede ser menor a 0 ");
            pregunta=dato.nextInt();
        }
        while(pregunta>i){
            System.out.println("Ingresa calificación: ");
            nota=dato.nextInt();
            acumulado=nota+0;
                    i++;   
        }
        promedio=(acumulado/pregunta);
         System.out.println("el promedio es "+promedio);
     }
}
      
