/*
Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y 
buscarlo en la tabla. Se debe mostrar la posición en que se 
encuentra. Si no está indicarlo con un mensaje.
*/
package arreglos;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arreglo[]= new int[10];
        int numero;
        
        System.out.print("1. Digite un valor: ");
        arreglo[0]=sc.nextInt();
        
        int i=1;
        do {
            System.out.print((i+1) + ". Digite un valor: ");
            arreglo[i]=sc.nextInt();
            
            if (arreglo[i]>arreglo[i-1]) {
                i++;
            }
        } while (i<10);
        
        System.out.println("Que numero deseas buscar?");
        numero=sc.nextInt();
        
        int encontrado=0;
        
        for (int k = 0; k < 10; k++) {
            if (arreglo[k]==numero) {
                System.out.println("El numero " + numero + " esta en la"
                        + " posicion: " + k);
                encontrado++;
            }
        }
        if (encontrado==0) {
                System.out.println("El numero " + numero + " no esta");
            }
    }
    
}
