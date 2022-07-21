/*
Ejercicio 16: Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar 
de dicho número
*/
package CiclosObucles;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digita un numero entre 0 y 10:");
        numero=sc.nextInt();
        
        System.out.println("La tabla de multiplicar del numero " + numero + " es: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(numero + " * " + (i+1) + " = " + (numero*(i+1)));
        }
    }
    
}
