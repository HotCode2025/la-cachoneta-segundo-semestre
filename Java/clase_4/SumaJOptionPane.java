
/*import java.util.Scanner;

public class SumaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Introduce números (0 para terminar):");

        do {
            numero = input.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
        input.close();
    }
}

*/
//ahora con JOptionePane
import javax.swing.JOptionPane;

public class SumaJOptionPane {
    public static void main(String[] args) {
        int numero;
        int suma = 0;

        do {
            String entrada = JOptionPane.showInputDialog("Introduce un número (0 para terminar):");
            if (entrada == null)
                break; 
            numero = Integer.parseInt(entrada);
            suma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
}