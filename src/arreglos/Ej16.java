/*
Ejercicio 16: Queremos desarrollar una aplicación que nos ayude a gestionar
las notas de un centro educativo. Cada grupo (o clase) está compuesto
por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre
de un grupo. Debemos mostrar al final: la nota media del grupo de cada
trimestre, y la media del alumno que se encuentra en la posición N
(N se lee por teclado).
*/
package arreglos;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double primero[]=new double [5];
        double segundo[]=new double[5];
        double tercero[]=new double[5];
        double sumPrimero=0, sumSegundo=0, sumTercero=0;
        int alumno;
        
        System.out.println("Notas del primer trimestre.");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". Una nota: ");
            primero[i]=sc.nextDouble();
            sumPrimero+=primero[i];
        }
        
        System.out.println("Notas del segundo trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". Una nota: ");
            segundo[i]=sc.nextDouble();
            sumSegundo+=segundo[i];
        }
        
        System.out.println("Notas del tercer trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". Una nota: ");
            tercero[i]=sc.nextDouble();
            sumTercero+=tercero[i];
        }
        
        System.out.println("Promedio general del primer trimestre: " + (sumPrimero/5));
        System.out.println("Promedio general del primer trimestre: " + (sumSegundo/5));
        System.out.println("Promedio general del primer trimestre: " + (sumTercero/5));
        
        do {
            System.out.print("Mostrar el promedio del alumno en la posicion: ");
            alumno=sc.nextInt();
        } while (alumno>4 || alumno<0);
        
        System.out.print("Promedio: " + ((primero[alumno]+segundo[alumno]+tercero[alumno])/3));
        System.out.println("");
    }
    
}
