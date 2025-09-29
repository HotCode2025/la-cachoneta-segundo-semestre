import javax.swing.JOptionPane;
/*
Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
 */
public class Ejercicio12JOP {
	//Creo una función recursiva para conseguir el factorial de un número
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		//Pido un número al usuario
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		//Llamo a la función factorial y muestro en pantalla el resultado
		int resultado = factorial(n);
		JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + resultado);
	}

}