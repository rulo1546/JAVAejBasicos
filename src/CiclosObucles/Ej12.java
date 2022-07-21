/*
Ejercicio 12: Pedir un número y calcular su factorial.
*/
package CiclosObucles;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digita un numero");
        int numero=sc.nextInt();
        long resultado=1;
        
        for (int i = 1; i <= numero; i++) {
            resultado*=i;
        }
        System.out.println("El factorial de "+ numero + " es: " + resultado);
    }
    
}
