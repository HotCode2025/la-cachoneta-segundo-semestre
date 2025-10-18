import javax.swing.JOptionPane;

public class Ejercicio4_5JOption {
    public static void main(String[] args) {
        int numero, suma = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero (0 para terminar): "));
            suma += numero;
        }while (numero != 0);
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }
}
