/*
Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, 
la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden mas de 
1.75
*/
package CiclosObucles;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        double sumEstatura=0, estatura;
        double sumEdad=0, edad;
        int mayorDeDocho=0, mayorDeUnoSet=0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\nAlumno " + (i+1) + ": \n" );
            System.out.println("Digita la edad: ");
            edad=sc.nextInt();
            if (edad>18) {
                mayorDeDocho++;
            }
            sumEdad+=edad;
            System.out.println("Digita la estatura: ");
            estatura=sc.nextDouble();
            if (estatura>=1.75) {
                mayorDeUnoSet++;
            }
            sumEstatura+=estatura;
        }
            
        System.out.println("La edad media es: " + (sumEdad/5));
        System.out.println("La estatura media es: " + (sumEstatura/5));
        System.out.println("Total de alumnos mayores de 18 años: "+ mayorDeDocho);
        System.out.println("Total de alumnos que miden mas de 1.75: " + mayorDeUnoSet);
    }
    
}
