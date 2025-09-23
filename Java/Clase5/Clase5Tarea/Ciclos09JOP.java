import javax.swing.*;

public class Ciclos09JOP {
	public static void main(String[] args) {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
		int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
		boolean error = false;

		if (dia > 30 || dia <= 0) {
			JOptionPane.showMessageDialog(null, "El dia esta fuera del rango (1-30)");
			error = true;
		}
		if (mes > 12 || mes <= 0) {
			JOptionPane.showMessageDialog(null, "El mes esta fuera del rango (1-12)");
			error = true;
		}
		if (anio > 2025 || anio < 0) {
			JOptionPane.showMessageDialog(null, "El año esta fuera del rango (0-2025)");
			error = true;
		}

		if (error) {
			JOptionPane.showMessageDialog(null, "La fecha \"" + dia + "/" + mes + "/" + anio + "\" es incorrecta");
		} else {
			JOptionPane.showMessageDialog(null, "La fecha \"" + dia + "/" + mes + "/" + anio + "\" es correcta");
		}
	}
}
