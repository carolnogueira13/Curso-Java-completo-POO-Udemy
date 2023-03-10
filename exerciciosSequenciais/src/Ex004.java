import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

public class Ex004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorDaHora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorDaHora = sc.nextDouble();
		
		salario = horas * valorDaHora;
		
		System.out.printf("NUMBER = %d\n", numero);
		System.out.printf("SALARY = US$ %.2f\n", salario);
		
		
		sc.close();
		
	}

}
