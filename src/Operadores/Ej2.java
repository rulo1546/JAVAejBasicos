/*
Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un empleado a partir 
de sus horas semanales trabajadas y de su salario por hora.
 */
package Operadores;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salarioXhora;
        int horasTrabajadas;
        double salarioXsemana;
        System.out.println("Cuantos horas trabajaste esta semana?");
        horasTrabajadas=sc.nextInt();
        System.out.println("Cuanto ganas por hora?");
        salarioXhora=sc.nextDouble();
        salarioXsemana=salarioXhora*horasTrabajadas;
        System.out.println("Tu salario esta semana, por haber trabajado " + horasTrabajadas
        + " horas es de: " + salarioXsemana + " pesos.");
    }
}
