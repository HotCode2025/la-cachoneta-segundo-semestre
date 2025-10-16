/* Ejercicio 2 leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un cero */
package clase2;

import java.util.Scanner;

public class ejercicio2Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if (numero > 0){
                System.out.println("El numero " + numero + " es positivo.");
            } else {
                System.out.println("El numero " + numero + " es negativo.");
            }
            System.out.print("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero es 0, el programa ha finalizado.");
        entrada.close();
    }
}
