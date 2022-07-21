/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo, y calcular la media.
*/
package CiclosObucles;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double num, count=0, sum=0;
        double media;
        
        System.out.println("Digita un numero");
        num=sc.nextInt();
        
        while (num>0) {
            count++;
            sum+=num;
            
            System.out.println("Digita un numero");
            num=sc.nextInt();
            
        }
        media=sum/count;
        System.out.println("Se digitaron: " + count + " numeros.");
        System.out.println("La suma es " + sum + " ");
        System.out.println("El promedio es: " + media);
        
    }
    
}
