import java.util.Scanner;

public class Ejercicio11Scanner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // cierra automáticamente el scanner
            final int TOTAL_IMPARES = 10;
            long productoImpares = 1;

            System.out.println("Calculando el producto de los primeros " + TOTAL_IMPARES + " números impares:");

            for (int numeroImpar = 1, cantidadImpares = 0; cantidadImpares < TOTAL_IMPARES; numeroImpar += 2, cantidadImpares++) {
                productoImpares *= numeroImpar;
                System.out.println(String.format("Impar #%d: %d", cantidadImpares + 1, numeroImpar));
            }
            scanner.close();
            System.out.println("Resultado final: " + productoImpares);
        }
    }
}
