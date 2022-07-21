/*
Ejercicio 5: La calificacion final de un estudiante de informatica se calcula con base a las
calificaciones de cuatro aspectos de su rendimiento academico: participacion, primer examen parcial,
segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores entran a la 
calificacion final con ponderaciones del 10%, 25%, 25%, y 40%, Hacer un programa que
calcule e imprima la calificacion final obtenida por un estudiante.
 */
package Operadores;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double notaParticipacion, notaPrimerExa, notaSegunExa, notaExaFin, notaFinal;
        double n1, n2, n3, n4;
        
        System.out.println("Digita tu calificacion en participaciones");
        notaParticipacion=sc.nextDouble();
        n1=(notaParticipacion)/10;
        
        System.out.println("Digita tu calificacion en el primer examen");
        notaPrimerExa=sc.nextDouble();
        n2=(notaPrimerExa*2.5)/10;
        
        System.out.println("Digita tu calificacion en el segundo examen");
        notaSegunExa=sc.nextDouble();
        n3=(notaSegunExa*2.5)/10;
        
        System.out.println("Digita tu calificacion en el examen final");
        notaExaFin=sc.nextDouble();
        n4=(notaExaFin*2)/5;
        
        notaFinal=n1+n2+n3+n4;
        
        System.out.println("Tu calificacion final es: " + notaFinal);
    }
}
