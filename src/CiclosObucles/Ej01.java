/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se 
introduzca un número negativo.
*/
package CiclosObucles;

import javax.swing.JOptionPane;
//importando con control shit i 

public class Ej01 {//clase 
    public static void main(String[] args) {//metodo main 
        
        int numero;//variable entera
        double cuadrado;//variable double 
        
        
        do {            //lo que esta dentro el do se hace minimo una vez 
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero:"));
            //Joptionpane, solo acepta strings, por eso se convierte a entero con integer parse int 
            
            if (numero>0) {
                cuadrado=Math.pow(numero, 2);//calculando el cuadrado 
                JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es: " + cuadrado );
            }
        } while (numero>0);//mientras el numero sea mayor a cero 
    }
    
}
