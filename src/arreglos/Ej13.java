/*
Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla 
los elementos pares de la primera, y a continuación los elementos 
impares.
*/
package arreglos;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arreglo1[]=new int[10];
        int arreglo2[]=new int[10];
        
        System.out.print("Llenando el arreglo: \n");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". Digite un valor: ");
            arreglo1[i]=sc.nextInt();
        }
        
        System.out.println("El arreglo es: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(arreglo1[j] + " ");
        }
        
        System.out.println("\nSeparando: Pares/Impares.");
        int q=0;
            for (int l = 0; l < 10; l++) {
                if (arreglo1[l]%2==0) {
                    arreglo2[q]=arreglo1[l];
                    q++;
                }
            }
            for (int m = 0; m < 10; m++) {
                if (arreglo1[m]%2!=0) {
                    arreglo2[q]=arreglo1[m];
                    q++;
                }
            }
        
        System.out.println("El arreglo final es: ");
        
        for (int n = 0; n < 10; n++) {
            System.out.print(arreglo2[n] + " "); 
        }
        System.out.println("");
    }
    
}
