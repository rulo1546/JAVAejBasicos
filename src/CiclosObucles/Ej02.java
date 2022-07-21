/*
Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que 
se introduzca un 0.
 */
package CiclosObucles;//paquete

import javax.swing.JOptionPane;//importando el JOptionPane

public class Ej02 {//Clase
    public static void main(String[] args) {//metodo main 
        
        int numero;//variable 
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));//guardamos el numero que 
        //introduzca el usuario, lo pasamos a entero
        
        while (numero!=0) {//mientras numero sea diferente de cero 
            if(numero>0){//si es mayor a cero 
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");//es positivo
            }else{//sino 
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo");//es negativo 
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        }
    }
    
}
