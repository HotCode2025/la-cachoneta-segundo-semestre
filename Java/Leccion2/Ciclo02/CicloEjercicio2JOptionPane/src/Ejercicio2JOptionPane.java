import javax.swing.*;

public class Ejercicio2JOptionPane {
    public static void main(String[] args) {

        var numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));

        while(numero!=0) {
            if(numero>0) {
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es POSITIVO");
            }
            else {
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es NEGATIVO");
            }

            System.out.println("DIGITE OTRO");
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        }
        JOptionPane.showMessageDialog(null, "EL NUMERO 0 FINALIZO EL PROGRAMA");

    }
}
