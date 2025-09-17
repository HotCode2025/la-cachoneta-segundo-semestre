import javax.swing.*;
import java.util.Scanner;

public class Ciclos08 {
	public static void main(String[] args) {
		/*
		Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N (con Scanner y JOptionPane)
		 */

		System.out.println("Digite a continuación su opcion (1 para Scanner 2 para JOptionPane y 3 para Salir): ");
		Scanner sc = new Scanner(System.in);
		int opcion = Integer.parseInt(sc.nextLine());
		int numero = 0;
		while (opcion != 3) {
			String numeros = "";

			if (opcion == 1) {
				System.out.println("Usted eligio la opción de Scanner");
				System.out.println("Digite un número: ");
				numero = Integer.parseInt(sc.nextLine());
				for (int i = 1; i <= numero; i++) {
					if (i != numero) {
						numeros = numeros + String.valueOf(i) + "-";
					} else {
						numeros = numeros + String.valueOf(i);
					}
				}
				System.out.println(numeros);
				System.out.println("Digite su nueva opcion: ");
				opcion = Integer.parseInt(sc.nextLine());
			}

			if (opcion == 2) {
				JOptionPane.showMessageDialog(null, "Usted eligio la opción de JOptionPane");
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
				for (int j = 1; j <= numero; j++) {
					if (j != numero) {
						numeros = numeros + String.valueOf(j) + "-";
					} else {
						numeros = numeros + String.valueOf(j);
					}
				}
				JOptionPane.showMessageDialog(null, numeros);
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite su nueva opcion: "));
			}

			if (opcion != 1 && opcion != 2 && opcion != 3) {
				System.out.println("Usted eligio una opcion equivocada, vuelva a elegir una opcion: ");
				opcion = Integer.parseInt(sc.nextLine());
			}
		}

	}
}
