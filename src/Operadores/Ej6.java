/*
Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma.
 */
package Operadores;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        double resultado;
        System.out.println("Digita el termino a:");
        a=sc.nextInt();
        
        System.out.println("Digita el termino b:");
        b=sc.nextInt();
        
        resultado=Math.pow(a, 2)+2*a*b+Math.pow(b, 2);
        
        System.out.println("El resultado de la operacion es: " + resultado);
    }
}
