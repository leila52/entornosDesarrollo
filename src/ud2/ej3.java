package ud2;

public class ej3 {
//valores de i cuando vale 2,3 9 y 10 y decir cuanto vale temp a y b
//i en 2 temp=1 ,a=0 , b=1
//i en 3 temp=2 ,a= 1, b=1
//i en 9 temp=34,a=13 , b=21
//i en 10 no hace nada ya que en el for no es menor igual a n entonces el 10 no se mete
// 
	public static void main(String[] args) {
		int n = 10;
		int a = 0, b = 1;
		System.out.print(a + ", " + b);
		for (int i = 2; i < n; i++) {
		int temp = a + b;
		System.out.print(", " + temp);
		a = b;
		b = temp;
		}

	}

}
