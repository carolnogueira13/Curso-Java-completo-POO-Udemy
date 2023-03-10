import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
public class Ex005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		double preco1, preco2, pago;
		
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		pago = (quant1 * preco1) + (quant2 * preco2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", pago);
		
		sc.close();
		

	}

}
