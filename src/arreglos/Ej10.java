/*
Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números enteros y 
desplace N posiciones en el arreglo (N es digitado por el usuario).
*/
package arreglos;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arre1[]=new int[10];
    int arreAux[]=new int[10];
    int mover;
    
    
    //llenando el arreglo
        System.out.print("Llenando el arreglo: \n");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". Digite un valor: ");
            arre1[i]=sc.nextInt();
        }
        
        //Mostrando el arreglo original
        System.out.println("Arreglo original: ");
        for (int a = 0; a < 10; a++) {
            System.out.print(arre1[a] + " ");
        }
        System.out.println("");
        
        
        //espacios a mover
        System.out.print("Cuantos espacios mover el arreglo: ");
        mover=sc.nextInt();
        int mover2=mover;
        int x=0;
        
        
        //guardando en el arreglo auxiliar, las ultimas N posiciones del arreglo original
        for (int b = 0; b < mover; b++) {
            arreAux[b]=arre1[10-mover2];
            mover2--;
        }
        
        
        //llenando el resto del arreglo auxiliar, con el restande del arreglo original 
        mover2=mover;
        for (int d = (mover2); d < 10; d++){
            arreAux[d]=arre1[x];
            x++;
        }
        
        System.out.println("\nArreglo final: ");
        for (int e = 0; e < 10; e++) {
            System.out.print(arreAux[e] + " ");
        }
        System.out.println("");
    }
    
}
