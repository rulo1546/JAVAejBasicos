/*
Ejercicio 4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos numeros se han 
introducido.
 */
package CiclosObucles;//paquete

import javax.swing.JOptionPane;//JOptionPane

public class Ej04 {//clase
    public static void main(String[] args) {//main 
        
        int numero,contador=0;//variables int numero y contador igualada a cero 
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));//introduce un numero entero 
        
        while (numero>0) {//mientras el numero sea mayor a cero 
            if (numero>0) {//si el numero es mayor a cero, incrementa el contador en 1 
                contador++;
            }
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
            //ya se incremento el contador, ahora pide otro numero 
        }
        JOptionPane.showMessageDialog(null, "Se digitaron " + contador + " numeros.");
        //saliendo del while, imprime
    }
    
}
