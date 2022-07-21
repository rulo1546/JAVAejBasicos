/*
Ejercicio 6: Hacer un programa que tome dos numeros y diga si ambos son pares o impares.
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej6 {
    public static void main(String[] args) {
        int n1, n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        
        if(n1%2==0 && n2%2 ==0){
            JOptionPane.showMessageDialog(null, "Los dos numeros son pares");
        }else if(n1%2!=0 && n2%2!=0){
            JOptionPane.showMessageDialog(null, "Los dos numeros son impares");
        }else{
            JOptionPane.showMessageDialog(null, "Un numero es par y el otro impar");
        }
    }
}
