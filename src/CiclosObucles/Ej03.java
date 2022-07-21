/*
Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
package CiclosObucles;//paquete

import javax.swing.JOptionPane;//importando el JOPtionpane

public class Ej03 {//clase
    public static void main(String[] args) {//metodo main 
        
        int numero;//variable
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));//numero pasado a int 
        
        while (numero!=0) {//mientras numero sea diferente de cero 
            if (numero%2==0) {//si la division entre 2 da el resuido igual a cero 
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es par");//el numero es par
            }else{//de lo contrario
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es impar");//es impar
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        }
    }
    
}
