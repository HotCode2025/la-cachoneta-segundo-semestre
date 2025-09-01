/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
Lo hacemos pimero con clase Scanner
Luego lo hacemos con la clase JOptionPane
*/
package Ciclos04;

import javax.swing.JOptionPane;

public class Ejercicio04_JO {
    public static void main(String[] args) {
        int numero;
        int contador = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (negativo para salir):"));
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);

        JOptionPane.showMessageDialog(null, "Se introdujeron " + contador + " números.");
    }
}
