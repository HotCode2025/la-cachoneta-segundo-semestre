import java.util.Scanner;




public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        var numero=Integer.parseInt(sc.nextLine());


        while(numero!=0) {
            if(numero>0) {
                System.out.println("El numero " + numero + " es POSITIVO");
            }
            else {
                System.out.println("El numero " + numero + " es NEGATIVO");
            }

            System.out.println("DIGITE OTRO");
            numero=Integer.parseInt(sc.nextLine());
        }
        System.out.println("El numero a finalizado el programa");



    }
}
