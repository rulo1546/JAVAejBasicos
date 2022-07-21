/*
Ejercicio 22: Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
*/
package CiclosObucles;

import javax.swing.JOptionPane;

public class Ej22 {
    public static void main(String[] args) {
        double calific;
        int suspensos=0;
        
        for (int i = 0; i < 5; i++) {
            do {                
                calific=Double.parseDouble(JOptionPane.showInputDialog((i+1) + ". Digite la calificacion: "));
            if (calific<6) {
                suspensos++;
            }
            } while (calific<0 || calific>10);
        }
        
        JOptionPane.showMessageDialog(null, "Numero de alumnos suspensos: " + suspensos);
    }
    
}
