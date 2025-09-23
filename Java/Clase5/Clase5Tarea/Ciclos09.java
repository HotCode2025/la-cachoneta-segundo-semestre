import java.util.Scanner;

/*
Ejercicio 9: Pedir el día, mes y año de una fecha e
indicar si la fecha es correcta. Suponiendo que
todos los meses son de 30 días
 */
public class Ciclos09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el día: ");
		int dia = Integer.parseInt(sc.nextLine());
		System.out.println("Digite el mes: ");
		int mes = Integer.parseInt(sc.nextLine());
		System.out.println("Digite el año: ");
		int anio = Integer.parseInt(sc.nextLine());;
		boolean error = false;

		if (dia > 30 || dia <= 0) {
			System.out.println("El dia esta fuera del rango (1-30)");
			error = true;
		}
		if (mes > 12 || mes <= 0) {
			System.out.println("El mes esta fuera del rango (1-12)");
			error = true;
		}
		if (anio > 2025 || anio < 0) {
			System.out.println("El año esta fuera del rango (0-2025)");
			error = true;
		}

		if (error) {
			System.out.println("La fecha \"" + dia + "/" + mes + "/" + anio + "\" es incorrecta");
		} else {
			System.out.println("La fecha \"" + dia + "/" + mes + "/" + anio + "\" es correcta");
		}
	}
}
