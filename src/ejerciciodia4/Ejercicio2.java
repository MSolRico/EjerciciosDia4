/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia4;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Ejercicio2 {
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje 
de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.*/
           public static void main(String[] args) {
                     String frase, correcta="eureka";
                 Scanner read=new Scanner(System.in);
                 System.out.println("adivina la frase secreta:");
                 frase=read.nextLine();
        
                 if (frase.equals(correcta)){
                      System.out.println("Adivinaste!!!");
                 } else{
                System.out.println("ERRRORRRR!");
               }
       
    }
}

           