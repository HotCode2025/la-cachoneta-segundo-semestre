import javax.swing.JOptionPane;

public class ProductoNumerosImparesJOptionPane {
    public static void main(String[] args) {
        final int TOTAL_IMPARES = 10;
        long productoImpares = 1;
        StringBuilder mensaje = new StringBuilder("Calculando el producto de los primeros " + TOTAL_IMPARES + " números impares:\n");

        for (int numeroImpar = 1, cantidadImpares = 0; cantidadImpares < TOTAL_IMPARES; numeroImpar += 2, cantidadImpares++) {
            productoImpares *= numeroImpar;
            mensaje.append(String.format("Impar #%d: %d%n", cantidadImpares + 1, numeroImpar));
        }

        mensaje.append("Resultado final: ").append(productoImpares);
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
