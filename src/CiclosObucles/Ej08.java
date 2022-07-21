/*
Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N.
*/
package CiclosObucles;

import javax.swing.JOptionPane;

public class Ej08 {
    public static void main(String[] args) {
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        
        System.out.println("Los numeros del 1 al " + num + " son: ");
        
        for (int i = 0; i < num; i++) {
            System.out.print((i+1)+" ");
            
        }
        System.out.println("");
    }
    
}
