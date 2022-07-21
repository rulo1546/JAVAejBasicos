/*
Ejercicio 8: Pedir un numero entre 0 y 99,999 y decir cuantas ciras tiene.
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej8 {
    public static void main(String[] args) {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 99,999"));
        
        //1, 10, 100, 1000, 10000, 100000
        
        if(numero<10){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene " + "una cifra");
        }else if(numero<100){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene " + "dos cifras");
        }else if(numero<1000){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene " + "tres cifras");
        }else if(numero<10000){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene " + "cuatro cifras");
        }else if(numero<100000){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene " + "cinco cifras");
        }else{
            JOptionPane.showMessageDialog(null, "Mas de cinco cifras");
        }
    }
}
