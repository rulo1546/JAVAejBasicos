/*
Ejercicio 11: Construir un programa que simule el funcionamiento de una calculadora que puede 
realiar las cuatro operaciones aritmeticas b�sicas (suma, resta, producto y divisi�n) con valores
num�ricos enteros. El usuario debe especificar la operacion con el primer car�cter del primer 
par�metro de la l�nea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para el 
producto y D o d para la divisi�n.
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej11 {
    public static void main(String[] args) {
        
        double a,b;
        char opcion;
        
        opcion=JOptionPane.showInputDialog("Digita:\nS para sumar\nR para restar\n"
                + "P o M para multiplicar\nD para dividir").charAt(0);
        
        if(opcion=='s' || opcion=='S'){ //sumar
            a=Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
            b=Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
            JOptionPane.showMessageDialog(null, "El resultado de " + a + " + " + b + " es: " + (a+b));
        }else if(opcion=='r' || opcion=='R'){//restar
            a=Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
            b=Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
            JOptionPane.showMessageDialog(null, "El resultado de " + a + " - " + b + " es: " + (a-b));
        }else if(opcion=='p' || opcion== 'P' || opcion=='m' || opcion=='M'){//multiplicar
            a=Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
            b=Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
            JOptionPane.showMessageDialog(null, "El resultado de " + a + " * " + b + " es: " + (a*b));
        }else if(opcion=='D' || opcion=='d'){//dividir
            a=Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
            b=Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
            JOptionPane.showMessageDialog(null, "El resultado de " + a + " / " + b + " es: " + (a/b));
        }else{//incorrecto
            JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        }
        
    }
    
}
