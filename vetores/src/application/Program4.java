// Problema "soma_vector"

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		double soma = 0.0;

		double[] numeros = new double[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%.1f ", numeros[i]);
			soma += numeros[i];
		}
		
		double media = soma/numeros.length;
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);

		sc.close();

	}

}
