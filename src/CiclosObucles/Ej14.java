/*
Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000.
*/
package CiclosObucles;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0, sueldo;
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Digite un sueldo");
            sueldo=sc.nextInt();
            if(sueldo>=1000){
                count++;
            }
        }
        
        System.out.println("Existe(n) " + count + " sueldo(s) mayore(s) a 1,000");
    }
    
}
