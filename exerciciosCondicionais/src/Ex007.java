import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class Ex007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		
		sc.close();

	}

}
