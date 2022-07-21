/*
Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros y la 
desplace una posición hacia abajo: el primero pasa a ser el segundo y el segundo pasa a 
ser el tercero y así sucesivamente. El último pasa a ser el primero.
*/
package arreglos;

import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int array[]=new int[10];
        int aux;
        int puntero=9;
        
        System.out.println("Llenando el array original: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". Digite un numero: ");
            array[i]=sc.nextInt();
        }
        
        System.out.println("El array original es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print (array[i] + " ");
        }
        System.out.println("\nMoviendo al array una posicion...");
        aux=array[9];
        for (int i = 0; i < 9; i++) {
            array[puntero]=array[puntero-1];
            puntero--;
        }
        array[0]=aux;
        
        System.out.println("El array recorrido es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
}
