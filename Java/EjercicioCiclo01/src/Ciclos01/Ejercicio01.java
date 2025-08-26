/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un número negativco
 */
package Ciclos01;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, cuadrado;
		System.out.println("Ingrese un numero: ");
		num = Integer.parseInt(entrada.nextLine());

		while (num >= 0) { // Mientras el número sea cero o positivo
			cuadrado = (int)Math.pow(num, 2);
			System.out.println("El numero "+ num +" elevado al cuadrado es: " + cuadrado);
			System.out.println("Ingrese otro número: ");
			num = Integer.parseInt(entrada.nextLine());
		}
		System.out.println("El programa ha finalizado por un número negativo");
	}
}
