/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
Lo hacemos pimero con clase Scanner
Luego lo hacemos con la clase JOptionPane
*/
package Ciclos04;

import java.util.Scanner;

public class Ejercicio04_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Introduce números (para terminar, escribe un número negativo): ");

        do {
            numero = Integer.parseInt(entrada.nextLine());
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);

        System.out.println("Se introdujeron " + contador + " números.");
    }
}
