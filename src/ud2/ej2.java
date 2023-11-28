package ud2;

public class ej2 {

	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
		sum += i;
		System.out.println("Valor de 'i': " + i);
		System.out.println("Valor de 'sum': " + sum);
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);

	}

}
