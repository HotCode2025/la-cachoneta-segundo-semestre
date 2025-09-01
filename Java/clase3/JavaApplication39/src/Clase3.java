import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un número (0 para salir):");
        numero = entrada.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
            } else {
                System.out.println(numero + " es impar");
            }

            System.out.println("Ingrese otro número (0 para salir):");
            numero = entrada.nextInt();
        }

        System.out.println("Programa finalizado.");
        entrada.close();
    }
}