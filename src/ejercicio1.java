
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
        Scanner entrada= new Scanner(System.in);
        String nombre;
        int notas;
        double calificacion;
        double notaTotal;
        // TODO code application logic here
        System.out.println("digite su nombre ");
        nombre=entrada.next();
        
        System.out.println("digite la cantidad de notas que desea");
        notas=entrada.nextInt();
        
        for(int i=0;i<notas;i++){
            System.out.println("Ingresa calificación ");
            calificacion=entrada.nextDouble();
            calificacion++;
            notaTotal=calificacion/notas;
            System.out.println("Total del promedio de notas "+notaTotal);
            
            
        }
       
        
    }
}
