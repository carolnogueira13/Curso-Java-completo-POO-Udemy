import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".


public class Ex021 {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		for (int i= 0; i < N; i++) {
			double x1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			if (x2 == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				System.out.println(x1/x2);
			}
		}
		
		sc.close();
		
	}

}
