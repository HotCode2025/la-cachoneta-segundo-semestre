import java.util.Scanner;
/*
Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
 */
public class Ejercicio12Scanner {
	//Creo una función recursiva para conseguir el factorial de un número
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		//Pido un número al usuario
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un número: ");
		int n = Integer.parseInt(sc.nextLine());
		//Llamo a la funcion factorial y muestro en pantalla el resultado
		int resultado = factorial(n);
		System.out.println("El factorial de " + n + " es: " + resultado);
	}

}