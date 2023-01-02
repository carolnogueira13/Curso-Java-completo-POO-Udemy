import java.util.Scanner;

// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
// um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
// que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
// exemplo.

public class Ex017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gasolina = 0, alcool = 0, diesel = 0;
		
		while (true) {
			int combustivel = sc.nextInt();
			if (combustivel == 1) {
				alcool += 1;
			}
			else if (combustivel == 2) {
				gasolina += 1;
			}
			else if (combustivel == 3) {
				diesel += 1;
			}
			else if (combustivel == 4) {
				break;
			}
			
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Gasolina = " + gasolina);
		System.out.println("Álcool = " + alcool);
		System.out.println("Diesel = " + diesel);
		
		sc.close();

	}

}
