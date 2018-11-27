package EjerciciosJava.Arrays;

public class Ejercicio3 {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n;
//		do {
//			System.out.println("Tamaño del vector (entre 10 y 1.000.000): ");
//			n = in.nextInt();
//			if (n < 10 || n > 1000000)
//				System.out.println("Tamaño incorrecto, tiene que estar comprendido entre 10 y 1.000.000");
//		} while (n < 10 || n > 1000000);

//		int [] vector = new int[n];
//		Random r = new Random();
//		for (int i=0; i<n; i++) {
//			vector[i] = r.nextInt(201) - 100;
//		}

		int [] vector = {
			-7, 41, 23, 13, 0, 0, 0, 0, 0, 0, 
			-6, 0, 0, 0, 0, 0, 0, 40, 50
		};
		
		int suma = 0;
		int parcial;
		for (int i=0; i<vector.length; i++) {
			if (vector[i] != 13)
				suma += vector[i];
			else {
				parcial = vector[i];
				for (int j=i+1; j<vector.length && j<=i+13; j++) {
					parcial += vector[j];
				}
				if (parcial == 7)
					suma += parcial;
				i += 13;
			}
		}
		System.out.println("Suma: " + suma);
	}
}
