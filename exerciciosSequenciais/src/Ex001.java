import java.util.Scanner;

// Exercício 1 Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

public class Ex001 {

	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in);
		
		int a, b, soma;
		a = scr.nextInt();
		b = scr.nextInt();
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		scr.close();
	}

}
