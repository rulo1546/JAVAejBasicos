/*

*/
package Busquedas;

import java.util.Scanner;

public class Secuencial {//busqueda secuencial 
    public static void main(String[] args) {//metodo main 
        Scanner sc=new Scanner(System.in);//escanner
        
        int arreglo[]=new int[100];//declaremos un arreglo de enteros de 100 elementos 99 posiciones 
        int num;//variable num 
        
        for (int i = 0; i < 100; i++) {//for de 0 a 99 
            arreglo[i]=(int)(Math.random()*100);//llenamos el arreglo con numeros randoms 
        }
        
        System.out.println("arreglo: ");//imprimiendo el arreglo generado 
        for (int i = 0; i < 100; i++) {//for de 0 a 100 
            System.out.print(arreglo[i] + " ");//imprime el arreglo de 0 de 1 de 2 hasta el 99 
        }
        
        System.out.println("\nQue numero quieres buscar");//imprime 
        num=sc.nextInt();//nombre del escanner punto y el siguiente enetero 
        
        
        boolean encontrado=false; //no se ah encontrado el valor 
        //recorremos el arreglo una vez
        for (int i = 0; i < 100; i++) {//for de 0 a 99 para recorrer el arreglo 
            if (arreglo[i]==num) { //si el numero q dio el usuario es igual a alguna pos del arreglo  
                System.out.println("El numero " + num + " esta en la posicion" //imprime 
                        + " " + i);
                encontrado=true;//si se encontro 
            }
        }
        if (encontrado==false) { //si no se encontro 
            System.out.println("El numero que buscas no esta");//imprime 
        }
        
        System.out.println("arreglo:"); //imprimiendo el arreglo de nuevo 
        for (int i = 0; i < 100; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
    
}
