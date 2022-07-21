/*
Ejercicio 4: En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los
$300- ¿Cual sera la cantidad que paga una persona por su compra?
 */
package Condicionales;

import javax.swing.JOptionPane;

public class Ej4 {
    public static void main(String[] args) {
        double compra;
        
        compra=Double.parseDouble(JOptionPane.showInputDialog("Digite de cuanto fue su compra"));
        
        if(compra>=300){
            compra-=compra*.2;
        }
        
        JOptionPane.showMessageDialog(null, "El total a pagar sera de: " + compra);
    }
    
}
