/*
Ejercicio 12: Leer por teclado una tabla de 10 elementos numéricos enteros
y una posicion (entre 0 y 9). Eliminar el elemento situado 
en la posicion dada sin dejar huecos.
*/
package arreglos;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arreglo[]=new int[10];
        int posEliminar;
        
        System.out.println("Llenando el arreglo: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". Digite un valor: ");
            arreglo[i]=sc.nextInt();
        }
        
        System.out.println("Tu arreglo es: ");
        
        for (int j = 0; j < 10; j++) {
            System.out.print(arreglo[j] + " ");
        }
        
        do {            
            System.out.print("\nQue posicion del arreglo eliminar? (0-9): ");
            posEliminar=sc.nextInt();
        } while (posEliminar<0 || posEliminar>9);
        
        for (int l = posEliminar; l < 9; l++) {
            arreglo[l]=arreglo[l+1];
        }
        arreglo[9]=0;
        System.out.println("El arreglo final es: ");
        
        for (int m = 0; m < 9; m++) {
            System.out.print(arreglo[m] + " ");
        }
        System.out.println("");
    }
    
}
