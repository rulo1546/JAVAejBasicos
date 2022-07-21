/*
Ejercicio 4: Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos 
en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
*/
package arreglos;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arreglo[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". Digite un valor: ");
            arreglo[i]=sc.nextInt();
        }
        System.out.println("Imprimiendo el arreglo...");
        int s=0, f=9;
        for (int i = 0; i < 10; i++) {
            if (i%2==0) {
                System.out.println(arreglo[s]);
                s++;
            }else{
                System.out.println(arreglo[f]);
                f--;
            }
        }
    }
    
}
// 1 2 3 4 5 6 7 8 9 10 
//1 10 2 9 3 8 4 7 5 6
//1 3 5 7 9 10 8 6 4 2========== 