/*
Ejercicio 7: Leer por teclado una serie de 10 números enteros. La aplicación
debe indicarnos si los números están ordenados de forma creciente, decreciente, o si 
están desordenados.
*/
package arreglos;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pos=0, neg=0, igual=0;
        
        int arreglo[]=new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". Digite un valor: ");
            arreglo[i]=sc.nextInt();
        }
        // 1 2 3 4 5 6 7 8 9 10 
        for (int i = 0; i < 9; i++) {
            if (arreglo[i]<arreglo[i+1]) {
                pos++;
            }else if (arreglo[i]>arreglo[i+1]) {
                neg++;
            }else{
                igual++;
            }
        }
        if (pos==9) {
            System.out.println("Array en forma: Creciente.");
        }else if(neg==9){
            System.out.println("Array en forma: Decreciente");
        }else if(igual==9){
            System.out.println("Todos los numeros son iguales.");
        }else{
            System.out.println("Array en forma: Desordenada");
        }
    }
    
}
