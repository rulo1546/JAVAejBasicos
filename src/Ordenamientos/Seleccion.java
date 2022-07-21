/*

*/
package Ordenamientos;

public class Seleccion {
    public static void main(String[] args) {
        int arreglo[]=new int[20];
        
        for (int i = 0; i < 20; i++) {
            arreglo[i]=(int)(Math.random()*100);
        }
        
        System.out.println("El arreglo es: ");
        
        for (int i = 0; i < 20; i++) {
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.println("\nOrdenando por seleccion...");
        
        int aux;
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (arreglo[j]>arreglo[i]) {
                    aux=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
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
