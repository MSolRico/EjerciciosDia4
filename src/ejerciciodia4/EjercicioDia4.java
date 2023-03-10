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
public class EjercicioDia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que dado un número determine si es par o impar.*/
        int num;
        Scanner read = new Scanner (System.in);
        System.out.println("Introduzca un numero");
        num = read.nextInt();
        if (num%2 != 0){
            System.out.println("El numero ingresado es impar");
        } else {
            System.out.println("El numero ingresado es par");
        }
            }
}
