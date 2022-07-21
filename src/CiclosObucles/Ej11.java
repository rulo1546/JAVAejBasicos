/*
Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares.
*/
package CiclosObucles;
public class Ej11 {
    public static void main(String[] args) {
        
        long resultado=1;    
        
        for (int i = 0; i < 20; i++) {
            if(i%2!=0){
                resultado*=i;
            }
        }
        
        System.out.println("El resultado es: " + resultado);
        System.out.println("");
    }
    
}
