import java.util.Scanner;
public class ejercicio9 {
private static Scanner sc;
	public static void main(String[] args) {
		// Dado un n�mero entero (mayor o igual a 0). Retorna el n�mero de cifras que tiene.
		sc = new Scanner (System.in);
		
		int N;
		System.out.println("Ingrese un numero entero positivo");
		N = sc.nextInt();
		int cont = F (N);
		System.out.println("El n�mero de cifras que tiene " + N + " es " + cont);
	}

	public static int F (int N){
		int cont = 0;
		while (N>=1){		
			N = N / 10;
			cont++;
		}
		return (cont);
	}
}