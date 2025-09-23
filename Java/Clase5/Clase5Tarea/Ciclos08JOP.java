import javax.swing.*;

public class Ciclos08JOP {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		JOptionPane.showMessageDialog(null, "A continuación se mostraran en pantalla todos los números del 1 al " + num);
		for (int i = 1; i <= num; i++) {
			JOptionPane.showMessageDialog(null,i);
		}
	}
}
