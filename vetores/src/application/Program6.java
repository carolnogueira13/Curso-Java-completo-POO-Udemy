/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

package application;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		
		int[] numeros = new int[n];
		int pares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt(); 
		}
		
		System.out.println();
		System.out.println("NÙMEROS PARES: ");
		for (int i= 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares++;
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES = " + pares);
		sc.close();

	}

}
