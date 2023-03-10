import java.util.Locale;
import java.util.Scanner;

// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.

public class Ex011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
	    double valor;
		
		if (cod == 1) {
			valor = quant * 4;
		}
		else if (cod == 2) {
			valor = quant * 4.5;
		}
		else if (cod == 3) {
			valor = quant * 5;
		}
		else if (cod == 4) {
			valor = quant * 2;
		}
		else if (cod == 5) {
			valor = quant * 1.5;
			
		}
		else {
			System.out.println("O código digitado não foi encontrado!");
			valor = 0;	
		}
		
		System.out.printf("Total = R$ %.2f", valor);
		
		sc.close();

	}

}
