package ud2;

public class ej6 {
//i=1 sum en syso 1
//i=2 sum en syso sum vale 6
//i=99 sum en syso sum imprime -307
//i=100 sum en syso sum imprime -414
	public static void main(String[] args) {
		int n = 100;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
		sum += i;
		if (i % 2 == 0) {
		sum *= 2;
		}
		System.out.println("Valor de 'i': " + i);
		System.out.println("Valor de 'sum': " + sum);
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
		
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);

	}

}
