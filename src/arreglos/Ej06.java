/*
Ejercicio 6: Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y 
mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, 
otros 3 de A, otros 3 de la B, etc.
*/
package arreglos;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a[]=new int[12];
        int b[]=new int[12];
        
        System.out.print("Llenando la tabla A:\n");
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1) + ". Digite un valor: ");
            a[i]=sc.nextInt();
        }
        
        System.out.print("Llenando la tabla B:\n");
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1) + ". Digite un valor: ");
            b[i]=sc.nextInt();
        }
        
        System.out.println("Imprimiendo 3A, 3B, 3A, 3b...");
        
        for (int i = 0; i <= 9; i+=3) {
            System.out.println("A: " +a[i]);
            System.out.println("A: " +a[i+1]);
            System.out.println("A: " +a[i+2]);
            
            System.out.println("B: " +b[i]);
            System.out.println("B: " +b[i+1]);
            System.out.println("B: " +b[i+2]);
        }
    }
    
}
