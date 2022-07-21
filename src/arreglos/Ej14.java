/*
Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados 
crecientemente. Copiar (fusionar) las dos tablas en una tercera, de 
forma que sigan ordenados.
*/
package arreglos;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //Declaracion de arreglos
        int arregloA[]= new int[10];
        int arregloB[]= new int[10];
        int arregloC[]= new int[20];
        
        
        //llenando el primer arreglo con numeros aleatoreos en forma
        //creciente
        System.out.println("Llenando el primer arreglo...");
        int i=1, aleatorio;
        arregloA[0]=(int)(Math.random()*100);
        do {
            aleatorio=(int)(Math.random()*100);
            if (aleatorio>=arregloA[i-1]) {
                arregloA[i]=aleatorio;
                i++;
            }
        } while (i<10);

        
        //Mostrando el primer arreglo.
        System.out.println("EL primer arreglo es: ");
        
        for (int j = 0; j < 10; j++) {
            System.out.print(arregloA[j] + " ");
        }
        
        
        //Llenando el arreglo 2 con numeros aleatoreos en forma creciente
        System.out.println("\nLlenando el regundo arreglo: ");
        
        i=1;
        arregloB[0]=(int)(Math.random()*100);
        do {
            aleatorio=(int)(Math.random()*100);
            if (aleatorio>=arregloB[i-1]) {
                arregloB[i]=aleatorio;
                i++;
            }
        } while (i<10);
        
        
        // Mostrando el segundo arreglo
        System.out.println("El segundo arreglo es: ");
        
        for (int l = 0; l < 10; l++) {
            System.out.print(arregloB[l] + " ");
        }
        
        
        //Fusionando los arreglos
        System.out.println("\nFusionando los dos arreglos: ");

        
        //Agregando los primeros 10 alementos del arreglo A en en al arreglo C
        for (int u=0; u<10; u++) {
            arregloC[u]=arregloA[u];
        }
        
        
        
        //Agregando los 10 elementos del arreglo B en el arreglo C 
        for (int v=10, vv=0 ; v<20; v++, vv++) {
            arregloC[v]=arregloB[vv];
        }
        
        System.out.println("El arreglo fusionado es: ");
        
        for (int n = 0; n < 20; n++) {
            System.out.print(arregloC[n] + " ");
        }
        System.out.println("\nOrdenando...");
        
        int aux;
        
        for (int jj = 0; jj < 20; jj++) {
            for (int o = 19; o > 0; o--) {
            if (arregloC[o]<arregloC[o-1]) {
                aux=arregloC[o];
                arregloC[o]=arregloC[o-1];
                arregloC[o-1]=aux;
            }
        }
        }
        
        for (int p = 0; p < 20; p++) {
            System.out.print(arregloC[p] + " ");
        }
        System.out.println("");
    }
    
}
