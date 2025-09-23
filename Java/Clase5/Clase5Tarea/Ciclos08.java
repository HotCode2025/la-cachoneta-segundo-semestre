import java.util.Scanner;

/*
Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N
 */
public class Ciclos08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un número: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("A continuación se mostraran en pantalla todos los números del 1 al " + num);
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
