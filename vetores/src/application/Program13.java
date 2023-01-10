package application;

import java.util.Locale;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] alturas = new double[n];
		char[] genero = new char[n];
		
		int homens = 0, mulheres = 0;
		
		double somatorioAlturaMulheres = 0.0;
		
		for (int i=0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
			if (genero[i] == 'M') {
				homens++;
			}
			else if (genero[i] == 'F') {
				mulheres++;
				somatorioAlturaMulheres += alturas[i];
			}
		}
		
		double menor = alturas[0];
		double maior = alturas[0];
		
		for (int i=0; i < n; i++) {
			if (alturas[i] > maior) {
				maior = alturas[i];
			}
			if (alturas[i] < menor) {
				menor = alturas[i];
			}
		}
		
		double media = somatorioAlturaMulheres / mulheres;
		
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.printf("Media das alturas das mulheres = %.2f\n", media);
		System.out.println("Numero de homens = " + homens);
		
		
		sc.close();

	}

}
