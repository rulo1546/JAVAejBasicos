/*
Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número aleatorio
entre 0-100, y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor 
o menor con respecto a N. El proceso termina cuando el usuario acierta y mostrar el
número de intentos.
*/
package CiclosObucles;//paquete 

import java.util.Scanner;//importando 

public class Ej05 {//clase
    public static void main(String[] args) {//metodo main 
        Scanner sc=new Scanner(System.in);//scanner q se llama sc 
        
        int random=(int)(Math.random()*100); //genera un numero random 
        int intentos=0, num;//variables
        System.out.println("Numero a adivinar " + random ); //imprime nRandom 
        do {//aunque sea una vez pide un numero 
            System.out.println("Digita un numero");
            num=sc.nextInt();//lo guardamos en num 
            intentos++;//se suma uno a los intentos 
            
            if (num>random) {//si el introducido es mayor a el generado 
                System.out.println("Mas bajo");
            }else if(num<random){//si el introducido es menor al generado 
                System.out.println("Mas alto");
            }else{//si no es mayor ni menor se encontro
                System.out.println("Correcto lo lograste en " + intentos + " intentos");
            }
            
        } while (num!=random);//mientras num sea diferente de random, sigue insistiendo 
        
        
        
    }
    
}
