package Sueltos;

public class PrimerArray {
	public static void main(String[] args) {
		int[] x = { 42, 36, 54, 87 };

		for (int e : x)
			System.out.println(e * 4);
		System.out.println();
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i] * 4);
		}
	}
}
