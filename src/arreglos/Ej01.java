/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
*/
package arreglos;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int [] arreglo= new int [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". Digita un numero: ");
            arreglo[i]=sc.nextInt();
        }
//        System.out.println("El arreglo es: ");
//        System.out.print("[ ");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arreglo[i] + " ");
//        }
//        System.out.println("]");
        System.out.print("El arreglo es: \n[ ");
        for(int i:arreglo){
            System.out.print(i + " ");
        }
        System.out.println(" ]");
    }
    
}
