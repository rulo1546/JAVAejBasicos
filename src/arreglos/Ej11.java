/*
Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma 
creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e 
insertarlo en el lugar adecuado para que la tabla continue ordenada. 
*/
package arreglos;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arreglo[] = new int[10];
        int numero;
        
        System.out.println("Llenando el arreglo: ");
        
        int i=0;
            System.out.print((i+1 ) + ". Digita un valor: ");
            arreglo[i]=sc.nextInt();
            i++;
        do {            
            System.out.print((i+1) + " Digita un valor: ");
            arreglo[i]=sc.nextInt();
            
            if (arreglo[i]>arreglo[i-1]) {
                i++;
            }
            
        } while (i<5);
        
        System.out.println("Tu arreglo es: ");
        
        for (int j = 0; j < 5; j++) {
            System.out.print(arreglo[j] + " ");
        }
        System.out.println("");
        
        System.out.print("Digita un numero : ");
        numero=sc.nextInt();
        arreglo[5]=numero;
        
        int aux;
        for (int k = 5; k > 0; k--) {
            if (arreglo[k]<arreglo[k-1]) {
                aux=arreglo[k];
                arreglo[k]=arreglo[k-1];
                arreglo[k-1]=aux;
            }
        }
        
        System.out.println("Imprimiendo los 6 elementos en orden creciente: ");
        
        for (int l = 0; l < 6; l++) {
            System.out.print(arreglo[l] + " ");
        }
        System.out.println("");
    }
    
}
