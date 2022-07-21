/*
Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente
manera: 
-Si trabaja 40 horas o menos se le paga $16 por hora
-Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20
por cada hora extra.
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej5 {
    public static void main(String[] args) {
        int horasTrabajadas;
        double salario;
        
        horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas que trabajo esta semana"));
        
        if(horasTrabajadas<=40){
            salario=horasTrabajadas*16;
        }else{
            horasTrabajadas-=40;
            salario=horasTrabajadas*20;
            salario+=640;
        }
        
        JOptionPane.showMessageDialog(null, "Tu salario es de " + salario);
    }
}
