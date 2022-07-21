/*
Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera
de la forma: el 1° de A, el 1° de B, el 2° de A, el 2° de B, etc.
*/
package arreglos;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a[]=new int[10];
        int b[]=new int[10];
        
        System.out.println("Llenando la tabla A: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". Digite un valor: ");
            a[i]=sc.nextInt();
        }
        
        System.out.println("Llenando la tabla B: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". Digite un valor: ");
            b[i]=sc.nextInt();
        }
        
        System.out.println("Intercalando valores...");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("A: " + a[i]);
            System.out.println("B: " + b[i]);
        }
    }
    
}
