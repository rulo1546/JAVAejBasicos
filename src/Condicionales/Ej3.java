/*
Ejercicio 3: Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej3 {
    public static void main(String[] args) {
        /*String letra;
        letra=JOptionPane.showInputDialog("Digita una letra");
        if(letra.charAt(0)=='A'||letra.charAt(0)=='B'||letra.charAt(0)=='C'||letra.charAt(0)=='D'||letra.charAt(0)=='E'||
                letra.charAt(0)=='F'||letra.charAt(0)=='G'||letra.charAt(0)=='H'||letra.charAt(0)=='I'||
                letra.charAt(0)=='J'||letra.charAt(0)=='K'||letra.charAt(0)=='L'||letra.charAt(0)=='M'||
                letra.charAt(0)=='N'||letra.charAt(0)=='Ñ'||letra.charAt(0)=='O'||letra.charAt(0)=='P'||
                letra.charAt(0)=='Q'||letra.charAt(0)=='R'||letra.charAt(0)=='S'||letra.charAt(0)=='T'||
                letra.charAt(0)=='U'||letra.charAt(0)=='V'||letra.charAt(0)=='W'||letra.charAt(0)=='X'||
                letra.charAt(0)=='Y'||letra.charAt(0)=='Z'){
            JOptionPane.showMessageDialog(null, "La letra es mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "La letra es minuscula");
        }*/
        char letra;
        
        letra=JOptionPane.showInputDialog("Digita una letra").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
}
