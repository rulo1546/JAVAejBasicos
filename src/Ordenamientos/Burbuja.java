/*
 
*/
package Ordenamientos;

public class Burbuja {
    public static void main(String[] args) {
        int arreglo[]=new int[20];
        for (int i = 0; i < 20; i++) {
            arreglo[i]=(int)(Math.random()*100);
        }
        
        System.out.print("El arreglo es: \n");
        for (int i = 0; i < 20; i++) {
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.println("Ordenandolo...");
        
        int aux;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19; j++) {
                if (arreglo[j]>arreglo[j+1]) {
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        System.out.println("El arreglo ordenado es: ");
        
        for (int i = 0; i < 20; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
    
}
