/*
Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma: 
Insuficiente, 
Suficiente, 
bien,
Notable y 
Sobresaliente.
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej12 {
    public static void main(String[] args) {
        int nota;
        
        nota=Integer.parseInt(JOptionPane.showInputDialog("Digite su nota:"));
        
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Suficiente");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Bien");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Notable");
                break;
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null, "Sobresaliente");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nota incorrecta");
        }
    }
   
}
