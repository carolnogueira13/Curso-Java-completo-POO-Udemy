/* Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];
		
		int somaPares = 0, pares = 0; 

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
				pares ++;
			}
		}
		
		if (pares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			double media = (double) somaPares/pares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
			
		}

		sc.close();

	}

}
