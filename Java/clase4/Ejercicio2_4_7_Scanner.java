import java.util.Scanner;

public class Ejercicio2_4_7_Scanner  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroIngresado;

        int sumaTotal = 0;

        int cantidadNumeros = 0;

        System.out.println("Introduce números positivos. Para terminar, escribe un número negativo:");

        while (true) {
            System.out.print("Número: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Intenta de nuevo.");

                scanner.next();

                continue;
            }

            numeroIngresado = scanner.nextInt();

            if (numeroIngresado < 0) {
                break;
            }

            sumaTotal += numeroIngresado;

            cantidadNumeros++;
        }

        if (cantidadNumeros > 0) {
            double promedio = (double) sumaTotal / cantidadNumeros;

            System.out.printf("El promedio es: %.2f%n", promedio);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        scanner.close();
    }
}
