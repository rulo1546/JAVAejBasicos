/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la 
media de los números positivos, la media de los negativos y contar el número de ceros.
*/
package arreglos;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double countPos=0, sumPos=0, countNeg=0, sumNeg=0, countCeros=0;
        
        int arreglo[]=new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". Digita un numero:");
            arreglo[i]=sc.nextInt();
            if (arreglo[i]>0) {
                countPos++;
                sumPos+=arreglo[i];
            }else if (arreglo[i]<0) {
                countNeg++;
                sumNeg+=arreglo[i];
            }else{
                countCeros++;
            }
        }
        
        
        if (countPos>0) {
            System.out.println("Media de los numeros positivos: " + (sumPos/countPos));
        }else{
            System.out.println("No existen numeros positivos");
        }
        
        if (countNeg>0) {
            System.out.println("Media de los numeros negavitos: " + (sumNeg/countNeg));
        }else{
            System.out.println("No existen numeros negativos");
        }
        if (countCeros>0) {
            System.out.println("Total de ceros: " + countCeros);
        }else{
            System.out.println("No existen ceros");
        }
    }
    
}
