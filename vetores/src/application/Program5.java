/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person[] person = new Person[n];
		
		double sum = 0.0, media, count = 0.0, percent;
		
		for (int i=0; i < person.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			if (age < 16) {
				count ++;
			}
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			person[i] = new Person(name, age, height);
			sum += person[i].getHeight();
			
		}
		
		media = sum /person.length;
		percent = (count * 100.0)/ person.length;
		
		System.out.printf("\nAltura média = %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percent ); // %% para aparecer o símbolo de % na tela
		
	
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}
		
		sc.close();

	}

}
