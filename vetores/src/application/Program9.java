/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double sum = 0.0, media;
		
		double[] numeros = new double[n];
		
		for (int i=0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			sum += numeros[i];
		}
		
		media = sum/numeros.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i=0; i < n; i++) {
			if (numeros[i] < media) {
				System.out.printf("%.1f\n", numeros[i]);
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
