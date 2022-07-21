/*

*/
package Ordenamientos;
public class Insercion {
    public static void main(String[] args) {
        int arreglo[]=new int [20];
        
        for (int i = 0; i < 20; i++) {
            arreglo[i]=(int)(Math.random()*100);
            
        }
        
        System.out.println("El arreglo es: ");
        
        for (int i = 0; i < 20; i++) {
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.println("\nOrdenando por insercion");
        
        int puntero1=1;
        int puntero2;
        int aux;
        while (puntero1<20) {
            puntero2=puntero1;
            do {
                if (arreglo[puntero2-1]>arreglo[puntero2]) {
                    aux=arreglo[puntero2-1];
                    arreglo[puntero2-1]=arreglo[puntero2];
                    arreglo[puntero2]=aux;
                }
                puntero2--;
                
            } while (puntero2>=1);
            puntero1++;
        }
        
        
        
        
        System.out.println("El arreglo ordenado es: ");
        
        for (int i = 0; i < 20; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
    
}
