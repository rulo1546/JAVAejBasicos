/*
Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
*/
package CiclosObucles;

import javax.swing.JOptionPane;

public class Ej20 {
    public static void main(String[] args) {
        
        int numero, max=0, sueldo;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita cuantos sueldos quieres ingresar:"));
        
        for (int i = 0; i < numero; i++) {
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Digita el sueldo " + (i+1) + " :"));
            if (sueldo>max) {
                max=sueldo;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El sueldo maximo es: " + max);
    }
    
}
