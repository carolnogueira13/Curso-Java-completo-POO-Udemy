import java.util.Scanner;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class Ex008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		
		
		sc.close();

	}

}
