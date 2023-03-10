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
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números 
al usuario hasta que la suma de los números introducidos supere el límite inicial.*/


public class Ejercicio5 {
     public static void main(String[] args){
         int limite, num, suma;
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un valor limite");
         limite = leer.nextInt();
         num = 0;
         suma = 0;
                         
         
         while (suma <= limite) {
         System.out.println("Ingrese numeros");
         num = leer.nextInt();
         suma = num + suma;
                 }
         System.out.println("La suma de los valores ingresados ya superó el límite");
         
     }
    
     }

