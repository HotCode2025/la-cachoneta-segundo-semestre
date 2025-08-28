/* Ejercicio 3: Leer numeros hasta que se introduzca un cero
Para cada uno indicar si es par o impar. 
Primero lo harermos con la clase Scanner
Luego con la clase JOptionPane
*/
package Ciclos03;

import javax.swing.JOptionPane;

public class Ejercicio03_JO {
    public static void main(String[] args) {
        int numero;

        do {
            String input = JOptionPane.showInputDialog("Ingrese un número (0 para salir):");
            numero = Integer.parseInt(input);

            if (numero != 0) {
                String resultado = (numero % 2 == 0) ? "par" : "impar";
                JOptionPane.showMessageDialog(null, numero + " es " + resultado);
            }

        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "Programa finalizado.");
    }
}
