/*
Ejercicio 1: Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej1 {
    public static void main(String[] args) {

        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        
        if(numero%10!=0){
            System.out.println("El numero " + numero + " No es multiplo de 10");
        }else{
            System.out.println("El numero " + numero + " Es multiplo de 10");
        }
    }
}
