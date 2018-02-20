/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ejercicio4 {
    public static void main(String[] args){
        
    Scanner segundos= new Scanner(System.in);
    int pregunta;
    int semanas,horas,minutos;
    while(true==true){
        do{
            System.out.println("digite la cantidad de segundos");
            pregunta= segundos.nextInt();
        }while(pregunta<=0);
        semanas=(pregunta/604800);
        horas=(pregunta%60);
        minutos=(pregunta%604800)/60;
        System.out.println("las semas trancurridas son"+semanas);
        System.out.println("las semas horas son"+horas);
        System.out.println("las semas minutos son"+minutos);
    }
}
    
}
