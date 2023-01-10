package application;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		int maior = idades[0];
		
		for (int i=0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			if (idades[i] > maior) {
				maior = idades[i];
			}
			
		}
		
		System.out.print("PESSOA MAIS VELHA: ");
		for (int i=0; i < n; i++) {
			if (idades[i] == maior) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();

	}

}
