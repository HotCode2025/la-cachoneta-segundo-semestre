import javax.swing.JOptionPane;

public class Caja2 {
    int ancho;
    int alto;
    int profundidad;

    public Caja2(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public int calcularVolumen() {
        return ancho * alto * profundidad;
    }

    public static void main(String[] args) {
        try {
            String inputAncho = JOptionPane.showInputDialog("Ingrese el ancho de la caja:");
            String inputAlto = JOptionPane.showInputDialog("Ingrese el alto de la caja:");
            String inputProfundidad = JOptionPane.showInputDialog("Ingrese la profundidad de la caja:");

            int ancho = Integer.parseInt(inputAncho);
            int alto = Integer.parseInt(inputAlto);
            int profundidad = Integer.parseInt(inputProfundidad);

            Caja2 caja = new Caja2(ancho, alto, profundidad);
            int volumen = caja.calcularVolumen();

            JOptionPane.showMessageDialog(null, "El volumen de la caja es: " + volumen);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "⚠️ Error: Ingresá solo números enteros válidos.");
        }
    }
}