/*
Ejercicio 6: Pedir n�meros hasta que se teclee un 0, mostrar la suma de todos los n�meros 
introducidos.
*/
package CiclosObucles;//paquete 

import java.util.Scanner;//importando 

public class Ej06 {//clase
    public static void main(String[] args) {//metodo main 
        Scanner sc=new Scanner(System.in);//scanner 
        
        int num, suma=0;//variables
        
        System.out.println("Digita un numero");
        num=sc.nextInt();//guardando un numero 
        
        while (num!=0) {//mientras el numero sea diferente de cero 
            suma+=num;//ira sumando todos los numeros introducidos 
            
            System.out.println("Digita un numero");
            num=sc.nextInt();
        }
        
        System.out.println("La suma de los numeros que introduciste es: " + suma);
    }
    
}
