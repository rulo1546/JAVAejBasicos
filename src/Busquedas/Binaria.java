/*

*/
package Busquedas;

import java.util.Scanner;

public class Binaria { //clase binaria 
    public static void main(String[] args) {//metodo main 
        Scanner sc=new Scanner(System.in);//scanner 
        
        int arreglo[]=new int[30]; //arreglo con 30 espacios
        int numero;//variable numero
        
        for (int i = 0; i < 30; i++) { //for de 0 a 29 
            arreglo[i]=(int)(Math.random()*100);//llenando el arreglo con numeros randoms 
        }
        
        System.out.println("El arreglo es: ");//imprime
        
        for (int i = 0; i < 30; i++) {//for de 0 a 29
            System.out.print(arreglo[i] + " "); //imprime el arreglo generado 
        }
        
        System.out.println("\nOrdenando el arreglo: ");//imprime 
        
        int aux;//variable aux
        
        //se va a recorrer todo el arreglo 30 veces
        for (int i = 0; i < 30; i++) {//for de 0 a 29 
            for (int j = 0; j < 30; j++) {//for de 0 a 29 
                if (arreglo[j]>arreglo[i]) {//va a comprar el primer elemento con todos, luego el segundo con todos 
                    aux=arreglo[i];//si el elemento es mayor se cambia de lugar 
                    arreglo[i]=arreglo[j];//esto es ordenacion por burbuja 
                    arreglo[j]=aux;
                }
            }
        }
        
        System.out.println("El arreglo ordenado es: ");
        
        for (int i = 0; i < 30; i++) {//imprimiendo el arreglo con un for de 0 a 29
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.print("\nNumero a buscar en el arreglo: ");//para la busqueda secuencial el arreglo debe estar ordenado 
        numero=sc.nextInt();//guardamos el siguiente entero en la variable numero 
        
        System.out.println("Buscando el arreglo por busqueda binaria");
        
        boolean encontrado=false;//no a sido encontrado 
        int i=arreglo.length/2;//variable i, tiene el valor 15 
        int m=2;
        
        while (encontrado==false) {//mientras encontrado sea igual a false 
            m+=2;//m ira aunmentando de 2 en 2 
            if (numero>arreglo[i]) {//si el numero del usuario es mayor a el numero de la mitad del arreglo
                i+=arreglo.length/(m);//al puntero le sumamos
            }else if (numero<arreglo[i]) {//de lo contrario
                i-=arreglo.length/(m);//le restamos al puntero 
            }
            else{//si el numero no es mayor ni es menor, entonces si esta y se encuentra
                System.out.println("El numero que buscas si esta");
                encontrado=true;//encontrado 
            }
        }
        if (encontrado==false) {//no se encontro 
            System.out.println("El numero que buscas no esta");
        }
    }
    
}
