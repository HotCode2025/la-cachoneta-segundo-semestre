/* pedir 10 numeros y escribir la suma total */

import javax.swing.JOptionPane;

public class ejercicio10_joption {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
            float numero = Float.parseFloat(input);
            sum = sum + numero;
        }
        JOptionPane.showMessageDialog(null, "El total de la suma es: " + sum);
    }
}
