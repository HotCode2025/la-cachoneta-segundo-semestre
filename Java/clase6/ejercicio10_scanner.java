/* pedir 10 numeros y escribir la suma total */

import java.util.Scanner;

public class ejercicio10_scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero entero: ");    
            num = sc.nextFloat();
            suma = suma + num;    
        }
        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}