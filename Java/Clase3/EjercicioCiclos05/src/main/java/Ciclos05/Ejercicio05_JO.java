/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y
luego ir pidiendo numeros indicando "es mayor" o "es menor"
segun sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostamos 
el numero de intentos hechos
*/
package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05_JO {
    public static void main(String[] args) {
        int numeroAleatorio = (int)(Math.random() * 101); 
        int intento;
        int contadorIntentos = 0;
        boolean adivinado = false;

        JOptionPane.showMessageDialog(null, "¡Bienvenido al juego de adivinar el número!\nEl número está entre 0 y 100.");

        while (!adivinado) {
            String entrada = JOptionPane.showInputDialog("Ingresa un número entre 0 y 100:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Juego cancelado.");
                break;
            }

            intento = Integer.parseInt(entrada);
            contadorIntentos++;

            if (intento > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "El número es menor");
            } else if (intento < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "El número es mayor");
            } else {
                JOptionPane.showMessageDialog(null, "¡Correcto! Adivinaste el número en " 
                                                        + contadorIntentos + " intentos.");
                adivinado = true;
            }
        }
    }
}