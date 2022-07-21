package Operadores;


import java.util.Scanner;

/*
Ejercicio 8: Construir un programa que calcule y muestre por pantalla las raices de la ecuacion
de segundo grado de coeficientes reales. ax2 + bx + c = 0
*/

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double a,b,c;
        double resultado1, resultado2;
        
        System.out.println("Digite el valor de a");
        a=sc.nextInt();
        
        System.out.println("Digite el valor de b");
        b=sc.nextInt();
        
        System.out.println("Digite el valor de c");
        c=sc.nextInt();
        
        resultado1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        resultado2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        
        System.out.println("El resultado 1 es: " + resultado1);
        System.out.println("El restulado 2 es: " + resultado2);
    }
}
