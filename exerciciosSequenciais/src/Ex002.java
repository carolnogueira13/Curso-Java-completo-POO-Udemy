import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.

public class Ex002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		
		System.out.printf("Área = %.4f", area);
		
		sc.close();
		
	}

}
