import javax.swing.JOptionPane;

public class ClaseNumero5 {

    public static void main(String[] args) {
        //Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.
        //suponiendo que todos los meses son de 30 dias

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite un día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite mes"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Digite año"));

        if ((dia >= 1 && dia < 31) && (mes >= 1 && mes <= 12) && (año >= 0) ) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada es :"+dia+"-"+mes+"-"+año);
            
        } else {
            JOptionPane.showMessageDialog(null,"La fecha ingresada no es valida");
        }

    }

}