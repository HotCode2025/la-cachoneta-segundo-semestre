import javax.swing.JOptionPane;

public class Ejercicio2_4_7_JOption {
    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero >= 0) {
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        if (conteo == 0){
            JOptionPane.showMessageDialog(null, "Error, la division entre cero no existe");
        } else {
            promedio = (float)suma / conteo;
            JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
        }
    }
}
