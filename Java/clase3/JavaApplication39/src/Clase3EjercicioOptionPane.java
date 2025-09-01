import javax.swing.JOptionPane;

public class Clase3EjercicioOptionPane {
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