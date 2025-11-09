/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y
luego ir pidiendo numeros indicando "es mayor" o "es menor"
segun sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostamos 
el numero de intentos hechos
*/
package Ciclos05;

import java.util.Scanner;

public class Ejercicio05_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = (int)(Math.random() * 101); 
        int intento;
        int contadorIntentos = 0;

        System.out.println("Adivina el número (entre 0 y 100): ");

        do {
            System.out.println("Ingresa un número: ");
            intento = Integer.parseInt(entrada.nextLine());
            contadorIntentos++;

            if (intento > numeroAleatorio) {
                System.out.println("El número es menor");
            } else if (intento < numeroAleatorio) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("¡Correcto! Adivinaste el número.");
                System.out.println("Cantidad de intentos: " + contadorIntentos);
            }
        } while (intento != numeroAleatorio);
        entrada.close();
    }
}