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
public class Ejercicio3 {
    public static void main(String[] args) {
		String frase;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una frase de 8 caracteres");
		frase = sc.nextLine();
		
		if(frase.length()==8) {
			System.out.println("Correcto");
		}else {
			System.out.println("Incorrecto");
		}
		
	}
}
