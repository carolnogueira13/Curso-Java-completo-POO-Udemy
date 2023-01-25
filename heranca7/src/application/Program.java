package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPerson;
import entities.Individualperson;
import entities.Person;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble(); 
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individualperson(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new CompanyPerson(name, anualIncome, numberOfEmployees));
			}
		}
		
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double totalTaxes = 0.0;
		for (Person person: list) {
			System.out.println(person.getName() + ": $" + String.format("%.2f", person.taxespaid()));
			totalTaxes += person.taxespaid();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $%.2f", totalTaxes);
		
		
		sc.close();

	}

}
