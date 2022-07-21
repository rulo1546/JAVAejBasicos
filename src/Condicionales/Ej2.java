/*
Ejercicio 2: Pedir dos numeros y decir cual es el mayor o si son iguales.
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej2 {
    public static void main(String[] args) {
        int n1, n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        
        if(n1==n2){
            JOptionPane.showMessageDialog(null, "Los numeros " + n1 + " y " + n2 + " son iguales");
        }else if(n1>n2){
            JOptionPane.showMessageDialog(null, "El numero " + n1 + " es mayor a el numero " + n2);
        }else{
            JOptionPane.showMessageDialog(null, "El numero " + n2 + " es mayor que " + n1);
        }
    }
    
}
