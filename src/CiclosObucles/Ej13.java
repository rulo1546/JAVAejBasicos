/*
Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, la media de los 
números negativos y la cantidad de ceros.
*/
package CiclosObucles;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double countceros=0;
        double countPos=0,sumPos=0;
        double countNeg=0,sumNeg=0;
        double num;
        double resultado;
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Digita un numero");
            num=sc.nextInt();
            
            if (num>0) {
                countPos++;
                sumPos+=num;
            }
            if (num<0) {
                countNeg++;
                sumNeg+=num;
            }else if(num==0){
                countceros++;
            }
        }
        resultado=sumPos/countPos;
        System.out.println("Media de los numeros positivos: " + resultado);
        
        resultado=sumNeg/countNeg;
        System.out.println("Media de los numeros negativos: " + resultado);
        
        System.out.println("Total de ceros: " + countceros);
    }
    
}
