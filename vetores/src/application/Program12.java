package application;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		double media;
		
		for (int i=0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) +"o aluno:");
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();

		}
		
		System.out.println("Alunos aprovados: ");
		for (int i=0; i < n; i++) {
			media = (nota1[i] + nota2[i]) /2;
			if (media >= 6.0) {
				System.out.println(nomes[i]);
			}
			
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
