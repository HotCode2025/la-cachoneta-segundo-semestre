import java.util.Scanner;

public class Ejercicio4_5Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        do{
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = entrada.nextInt();
            suma += numero;
        }while (numero != 0);
        System.out.println("La suma es: " + suma);
        entrada.close();
    }
}
