package EjerciciosJava.Array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [] args) {
		Scanner sc= new Scanner(System.in);
		int v;
		
		do {
			System.out.println("Tamaño del vector (entre 1 y 50): ");
			v=sc.nextInt();
			if (v<2 || v>50) {
				System.out.println("Tamaño incorrecto, tiene que volver a introducir el tamaño");
			}
		}while(v<2 || v>=50);
		
		int [] vector=new int[v];
		Random r=new Random();
		for (int i=0; i<v; i++) {
			vector[i]=r.nextInt(201) - 100;
		}
		int [] vectoralreves=new int[vector.length];
		for(int i=0; i<v; i++) {
			vectoralreves[vector.length-i-1]=vector[i];
		}
		for(int i=0; i<v; i++) {
			System.out.println(vector[i]+" ");
		}
		System.out.println();
		for(int i=0; i<v; i++) {
			System.out.println(vectoralreves[i]+" ");
		}
	}
}
