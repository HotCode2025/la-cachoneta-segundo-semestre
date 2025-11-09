import java.util.Scanner;


public class Ciclos09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();

        // Validación con meses de 30 días
        boolean fechaValida = (dia >= 1 && dia <= 30) &&
                              (mes >= 1 && mes <= 12) &&
                              (anio > 0);

        if (fechaValida) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es válida.");
        } else {
            System.out.println("La fecha ingresada NO es válida.");
        }

        sc.close();
    }
}
