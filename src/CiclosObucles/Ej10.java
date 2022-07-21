/*
Ejercicio 10: Pedir 10 números y escribir la suma total.
*/
package CiclosObucles;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Digita un numero");    
            sum+=sc.nextInt();
        }
        
        System.out.println("La suma es: " + sum);
    }
    
}
