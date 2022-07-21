/*
Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. 
Suponiendo que todos los meses son de 30 dias.
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej9 {
    public static void main(String[] args) {
        int dia, mes, anio, verdad=0;
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digita un dia"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Digita un mes"));
        anio=Integer.parseInt(JOptionPane.showInputDialog("Digita un año"));
        
        if(dia>0 && dia<=30){
            if(mes>0 && mes<=12){
                if(anio>0 && anio<2022){
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");
                    verdad++;
                }
            }
        }
        
        if(verdad==0){
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
        }
    
    }
}
