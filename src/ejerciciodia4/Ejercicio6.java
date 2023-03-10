package Guia3;

import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado 
 * y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
 * y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
 *  si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
 *  se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
 * Si el usuario selecciona el carácter ‘S’ 
 * se sale del programa, caso contrario se vuelve a 
 * mostrar el menú.*/
public class Ejercicio6 {
	
	
	public static void main(String[] args) {
		int num1,num2,opc;
		double resultado;
		String opcion;
		resultado = 0;
		opc = 0;
		opcion = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		do {
			System.out.println("==============MENU===============");
			System.out.println("=============1-Sumar===============");
			System.out.println("=============2-Restar===============");
			System.out.println("=============3-Multiplicar===============");
			System.out.println("=============4-Dividir===============");
			System.out.println("=============5-Salir===============");
			opc = sc.nextInt();
			
			if(opc == 1) {
				resultado = num1+num2;
				System.out.println("La suma de los dos numeros es: "+resultado);
				System.out.println("Volviendo a menu...");
			}
			if(opc == 2) {
				resultado = num1-num2;
				System.out.println("La resta de los dos numeros es: "+resultado);
				System.out.println("Volviendo a menu...");
			}
			if(opc == 3) {
				resultado = num1*num2;
				System.out.println("La multiplicacion de los dos numeros es: "+resultado);
				System.out.println("Volviendo a menu...");
			}
			if(opc == 4) {
				resultado = num1/num2;
				System.out.println("La division de los dos numeros es: "+resultado);
				System.out.println("Volviendo a menu...");
			}
			if(opc == 5) {
				Scanner sc2 = new Scanner(System.in);
				System.out.println("¿Está seguro que desea salir del programa (S/N)?");
				opcion = sc2.nextLine();
				if(opcion.equals("S")) {
					System.out.println("Chau nos vemos!");
				}else if(opcion.equals("N")) {
					System.out.println("Volviendo al menu...");
				}
			}
			
			
		}while(!opcion.equals("S"));
	
	sc.close();
		
	}
	
}
