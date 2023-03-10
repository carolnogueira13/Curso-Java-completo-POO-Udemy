import java.util.Locale;
import java.util.Scanner;

// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
public class Ex012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		if (x < 0 || x > 100) {
			System.out.println("FORA DO INTERVALO!");
		}
		else if (x <= 25) {
			System.out.println("INTERVALO DE [0,25]");
		}
		else if (x <= 50) {
			System.out.println("INTERVALO DE (25,50]");
		}
		else if (x <= 75) {
			System.out.println("INTERVALO DE (50,75]");
		}
		else{
			System.out.println("INTERVALO DE (75,100]");
		}
		
		sc.close();

	}

}
