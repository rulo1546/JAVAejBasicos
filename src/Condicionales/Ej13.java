/*
Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo inicial de 1000
Dólares, con el siguiente menu de opciones: 
1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej13 {
    public static void main(String[] args) {
        
        int opcion;
        int dineroEnLaCuenta=1000;
        int retiro, ingreso;
        
        
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico "
                + "Digite: \n1. Ingresar dinero a la cuenta\n2. Retirar dinero de la cuenta"
                + "\n3. Salir"));
        
        switch (opcion) {
            case 1:
                ingreso=Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea ingresar a su cuenta?"));
                dineroEnLaCuenta+=ingreso;
                JOptionPane.showMessageDialog(null, "En su cuenta existe un total de: " + dineroEnLaCuenta);
                break;
            
            case 2:
                retiro=Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea retirar de su cuenta?"));
                if (retiro>dineroEnLaCuenta) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{
                    dineroEnLaCuenta-=retiro;
                }
                JOptionPane.showMessageDialog(null, "En su cuenta existe un total de: " + dineroEnLaCuenta);
                
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Salir.");
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        }
        
    }
    
}
