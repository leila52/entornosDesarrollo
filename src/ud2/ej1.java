package ud2;

public class ej1 {
//n pasa a ser 5 e i es uno y sum es uno,i pasa a ser 2 y sum pasa a ser 3
//i pasa a ser 3 sum llega a se 6 ,i pasa a ser 4 y sum llega a ser 10,
//i pasa a ser 5 y sum seria 15
//salimos del bucle for ya que se a llenado ya que n  a llegado a 5 y te hace el syso con lo que vale sum y n
//pantalla muestra el syso 
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
		sum += i;
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);

	}

}
