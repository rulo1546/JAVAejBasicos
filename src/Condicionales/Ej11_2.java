package Condicionales;

import javax.swing.JOptionPane;

/*
Ejercicio 11: Construir un programa que simule el funcionamiento de una calculadora que puede 
realiar las cuatro operaciones aritmeticas básicas (suma, resta, producto y división) con valores
numéricos enteros. El usuario debe especificar la operacion con el primer carácter del primer 
parámetro de la línea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para el 
producto y D o d para la división.
 */
public class Ej11_2 {
    public static void main(String[] args) {
        char opcion;
        double a,b;
        
        opcion=JOptionPane.showInputDialog("Digita:\nS para sumar\nR para restar\n"
                + "P o M para multiplicar\nD para dividir").charAt(0);
        
        switch (opcion) {
            case 's':
            case 'S':
                a=Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
                b=Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
                JOptionPane.showMessageDialog(null, "El resultado de " + a + " + " + b + " es: " + (a+b));
                break;
            case 'r':
            case 'R':
                a=Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
                b=Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
                JOptionPane.showMessageDialog(null, "El resultado de " + a + " - " + b + " es: " + (a-b));
                break;
            case 'p':
            case 'P':
            case 'M':
            case 'm':
                a=Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
                b=Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
                JOptionPane.showMessageDialog(null, "El resultado de " + a + " * " + b + " es: " + (a*b));
                break;
            case 'd':
            case 'D':
                a=Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
                b=Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
                JOptionPane.showMessageDialog(null, "El resultado de " + a + " / " + b + " es: " + (a/b));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
        }
    }
}
