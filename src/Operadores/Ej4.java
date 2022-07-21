/*
Ejercicio 4: A una compiañia de venta de carros usados, paga a su personal de ventas un salario de 
$1,000 mensuales, mas una comision de $150 por cada carro vendido, mas el 5% del valor de la venta
por carro. Cada mes el capturiste de la empresa ingresa en la computadora los datos pertinentes.
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 */
package Operadores;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double comision=150;
        double salarioTotal=1000;
        int autosVendidos;
        double precioAuto;
        
        System.out.println("Cuantos autos vendiste este mes?");
        autosVendidos=sc.nextInt();
        salarioTotal+=comision*autosVendidos;
        
        for (int i = 0; i < autosVendidos; i++) {
            System.out.println("Digita el valor del auto n." + (i+1) + ": ");
            precioAuto=sc.nextDouble();
            salarioTotal+=precioAuto*.05;
        }
        
        System.out.println("Tu salario este mes sera de " + salarioTotal);
    }
}
