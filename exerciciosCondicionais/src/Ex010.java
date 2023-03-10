import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class Ex010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicial, fim, duracao;
		
		inicial = sc.nextInt();
		fim = sc.nextInt();
		
		if (fim > inicial) {
			duracao = fim - inicial;
		}
		else {
			duracao = (fim + 24) - inicial;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();
	}

}
