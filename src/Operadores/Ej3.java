/*
Ejercicio 3: Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la 
mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que cualcule e imprima la 
cantidad de dinero que tienen entre los tres.
 */
package Operadores;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double dolaresGuillermo, dolaresLuis, dolaresJuan, total;
        System.out.println("Digite cuanto dinero tiene Guillermo");
        dolaresGuillermo=sc.nextDouble();
        dolaresLuis=dolaresGuillermo/2;
        dolaresJuan=(dolaresGuillermo+dolaresLuis)/2;
        total=dolaresGuillermo+dolaresLuis+dolaresJuan;
        System.out.println("Entre los 3 tienen la cantidad de " + total + " dolares.");
    }
}
