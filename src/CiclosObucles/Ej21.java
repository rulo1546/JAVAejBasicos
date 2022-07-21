/*
Ejercicio 21: Pedir 10 números, y mostrar al final si se ha introducido alguno negaativo.
*/
package CiclosObucles;

import javax.swing.JOptionPane;

public class Ej21 {
    public static void main(String[] args) {
        int numero, count=0;
        
        for (int i = 0; i < 10; i++) {
            numero=Integer.parseInt(JOptionPane.showInputDialog((i+1) + ". Digita un numero:"));
            if (numero<0) {
                count++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Numeros negativos: " + count);
    }
    
}
