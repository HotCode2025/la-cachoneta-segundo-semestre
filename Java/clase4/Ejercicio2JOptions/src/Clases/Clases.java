package Clases;

import javax.swing.JOptionPane;

public class Clases {

    public static void main(String[] args) {


        
        
        int numero3, suma = 0, contador = 0;
        double media;
        
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(numero3 >= 0){
            suma += numero3;
            contador++;
            numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
            if(contador > 0){
                media = (double) suma / contador;
                JOptionPane.showMessageDialog(null, "La media de los numeros es: "+media);
            }
            else{
                JOptionPane.showMessageDialog(null, "Nose ingresaron numeros positivos");
                 
                 
            }
           
        }
        
    }

