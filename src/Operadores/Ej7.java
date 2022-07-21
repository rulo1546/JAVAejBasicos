/*
Ejercicio 7: Construir un programa que, dado un numero total de horas, devuelve el numero de 
semanas, dias y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 
5 semanas, 6 dias y 16 horas.
*/
package Operadores;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalHoras, semanas, dias, horas;
        //1 dia=24hrs
        //1 semana=168 hrs
        
        System.out.println("Digite el total de horas:");
        totalHoras=sc.nextInt();
        
        semanas=totalHoras/168;
        dias=(totalHoras%168)/24;
        horas=(totalHoras%168)%24;
        
        System.out.println(semanas + " semanas\n" + dias + " dias\n" + horas + " horas");
    }
}
