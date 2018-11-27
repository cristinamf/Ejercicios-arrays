package EjerciciosJava.Array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		do {
			System.out.println("Tamaño del vector (entre 10 y 1.000.000): ");
			n = in.nextInt();
			if (n < 10 || n > 1000000)
				System.out.println("Tamaño incorrecto, tiene que estar comprendido entre 10 y 1.000.000");
		} while (n < 10 || n > 1000000);

		int [] vector = new int[n];
		Random r = new Random();
		long t0 = System.currentTimeMillis();
		for (int i=0; i<n; i++) {
			int valor;
			do {
				valor = r.nextInt(2000000) - 999999;
			} while (repetido(vector, valor, i - 1));		
			vector[i] = valor;
		}

		long t1 = System.currentTimeMillis();
		tiempoTranscurrido("Tiempo empleado en crear el vector", t1 - t0);
		for (int i=0; i<n; i++) {
			System.out.print(vector [i] + "  ");
		}
		System.out.println();
	}

	static boolean repetido(int [] vector, int valor, int p) {
		for (int i=0; i<=p; i++) {
			if (vector[i] == valor) {
				return true;
			}
		}
		return false;
	}

	static void tiempoTranscurrido(String msg, long t) {
		long m = t / 60000;
		t = t % 60000;
		long s = t / 1000;
		t = t % 1000;
		System.out.print(msg + ": ");
		System.out.println(m + "m " + s + "s " + t + "ms");
	}
}
