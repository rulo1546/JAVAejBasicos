/*
Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medida de masa, 
mostrar en pantalla un menú con las opciones posibles.
 */
package Condicionales;

import javax.swing.JOptionPane;

public class Ej14 {
    public static void main(String[] args) {
        
        int kg, opcion;
        
        kg=Integer.parseInt(JOptionPane.showInputDialog("Digite los KiloGramos"));
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1. Para pasar a libras\n2. Para pasar a toneladas"
                + "\n3. Para pasar a gramos"));
        
        switch (opcion) {
            case 1: //libras
                JOptionPane.showMessageDialog(null, ""+ kg +" kg equivalen a " + (kg*2.205)+" libras ");
                break;
                
            case 2://toneladas
                JOptionPane.showMessageDialog(null, ""+ kg +" kg equivalen a " + (kg/1000)+" toneladas ");
                break;
                
            case 3://gramos
                JOptionPane.showMessageDialog(null, ""+ kg +" kg equivalen a " + (kg*1000)+" gramos ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion Incorrecta.");
        }
        
        
    }
    
}
