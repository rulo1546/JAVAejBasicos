/*
Ejercicio 10: Pedir el dia, mes y a�o de una fecha e indicar si la fecha es correcta. 
Con meses de 28, 30 y 31 dias. Sin a�os bisiestos.
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Ej10 {
    public static void main(String[] args) {
        /*
        Meses con 30 d�as: 4.Abril, 6.Junio, 9.Septiembre y 11.Noviembre.
        Meses con 31 d�as: 1.Enero, 3.Marzo, 5.Mayo, 7.Julio, 8.Agosto, 10.Octubre y 12.Diciembre.
        Meses con 28 d�as: 2.Febrero 
        */
        
        int dia,mes,a�o;
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digita un dia"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Digita un mes"));
        a�o=Integer.parseInt(JOptionPane.showInputDialog("Digita un a�o"));
        
        if(mes==2 && dia>0 && dia<=28 && a�o>0 && a�o<2022){
            JOptionPane.showMessageDialog(null, "La fecha es correcta");
        }else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia >0 && dia<=31) && (a�o>0 && a�o<=2022)){
        JOptionPane.showMessageDialog(null, "La fecha es correcta");    
        }else if((mes==4 || mes==6 || mes==9 || mes==11) && (dia>0 && dia<=30) && (a�o>0 && a�o<=2022)){
            JOptionPane.showMessageDialog(null, "La fecha es correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Incorrecto");
        }
        
    }
    
}
