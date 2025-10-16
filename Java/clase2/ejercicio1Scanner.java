/* Ejercicio 1 : leer un numero y mostrar su cuadrado, repetir el proceso ahsta que se introduzca un numero negativo */

package clase2;

import java.util.Scanner;

public class ejercicio1Scanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, cuadrado;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: " + cuadrado);
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        entrada.close();
    }
}
