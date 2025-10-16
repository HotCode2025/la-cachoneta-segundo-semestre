/* Ejercicio 2 leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un cero */
package clase2;

import javax.swing.JOptionPane;

public class ejercicio2JOption {
    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            if (numero > 0){
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo.");
            } else {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "El numero es 0, el programa ha finalizado.");
    }
}
