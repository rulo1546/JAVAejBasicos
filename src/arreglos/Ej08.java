/*
Ejercicio 8: Dise�ar una aplicaci�n que declare una tabla de 10 elementos enteros. 
Leer mediante el  teclado 8 n�meros. Despu�s se debe pedir un n�mero y una posicion, 
insertarlo en la posici�n indicada, desplazando los que est�n detr�s.
*/
package arreglos;

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int numero, posicion, puntero=7, aux;
        int arreglo[]=new int[10];
        
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1) + ". Digita un valor: ");
            arreglo[i]=sc.nextInt();
        }
        
        System.out.print("Su arreglo es: [ ");
        for (int i = 0; i < 8; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("]");
        System.out.print("Digite un numero: ");
        numero=sc.nextInt();
        System.out.print("Digite una posicion: ");
        posicion=sc.nextInt();
        
        for (int i = 7; i >= posicion; i--) {
            aux=arreglo[puntero];
            arreglo[i+1]=aux;
            puntero--;
        }
        arreglo[posicion]=numero;
        
        System.out.println("El arreglo final es: ");
        System.out.print("[ ");
        for (int i = 0; i < 9; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(" ]");
    }
    
}
