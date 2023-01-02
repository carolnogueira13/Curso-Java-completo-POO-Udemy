import java.util.Scanner;

// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// Lembrando que, por definição, fatorial de 0 é 1.

public class Ex022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int fat = 1;
		
		for(int i = 1; i <= N; i++) {
			fat *= i;
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}
