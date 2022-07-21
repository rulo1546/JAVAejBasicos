/*
Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden nverso al 
introducido.
*/
package arreglos;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int [] arreglo = new int [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el elemento " + (i+1) + ": ");
            arreglo[i]=sc.nextInt();
        }
        
        
        System.out.print("El arreglo es: \n[ ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("]");
    }
    
}
