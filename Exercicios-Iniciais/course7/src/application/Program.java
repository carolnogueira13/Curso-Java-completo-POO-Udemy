package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); 
		String name = sc.nextLine();
		System.out.print("Is there a inicial deposit? [y/n]");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			System.out.print("Enter inicial deposit: ");
			double inicial = sc.nextDouble();
			acc = new Account(number, name, inicial);
		}
		else {
			acc = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: "+ acc);
		
		System.out.println();
		System.out.print("Enter deposit value: ");
		double value = sc.nextDouble();
		acc.deposit(value);
		System.out.println("Update account data: "+ acc);
		
		System.out.println();
		System.out.print("Enter withdraw value: ");
		value = sc.nextDouble();
		acc.withdraw(value);
		System.out.println("Update account data: "+ acc);
		
		
		sc.close();

	}

}
