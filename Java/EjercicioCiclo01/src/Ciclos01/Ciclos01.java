/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un número negativco
 */
package Ciclos01;

import javax.swing.*;

public class Ciclos01 {
	public static void main(String[] args) {
		int num, cuadrado;

		num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		while (num >= 0) {
			cuadrado = (int)Math.pow(num, 2);
			System.out.println("El numero "+ num +" elevado al cuadrado es: " + cuadrado);
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
		}
		System.out.println("El programa ha finalizado por un número negativo");
	}
}
