/*
Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) 
y suspensos.
*/
package CiclosObucles;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nota, aprobados=0, condicionados=0, suspensos=0;
        
        for (int i = 0; i < 6; i++) {
            do {                
                System.out.println("Digite la nota del alumno " + (i+1) + ": ");
                nota=sc.nextInt();
                
                if (nota>4 && nota<=10) {
                    aprobados++;
                }else if (nota<4 && nota>=0) {
                    suspensos++;
                }else if(nota==4){
                    condicionados++;
                }
            } while (nota<0 || nota>10 );
        }
        
        System.out.println(aprobados + " alumnos aprobados.\n" + suspensos + " alumnos suspensos "
                + "\n" + condicionados + " alumnos condicionados");
    }
    
}
