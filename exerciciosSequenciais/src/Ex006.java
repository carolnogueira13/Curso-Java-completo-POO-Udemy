import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
// mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

public class Ex006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTriagulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTriagulo = (a * c) / 2;
		areaCirculo = 3.14159 * c * c;
		areaTrapezio = ((a + b) * c ) / 2;
		areaQuadrado = b * b;
		areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO = %.3f\n", areaTriagulo);
		System.out.printf("CIRCULO = %.3f\n", areaCirculo);
		System.out.printf("TRAPEZIO = %.3f\n", areaTrapezio);
		System.out.printf("QUADRADO = %.3f\n", areaQuadrado);
		System.out.printf("RETANGULO = %.3f\n", areaRetangulo);
		
		sc.close();

	}

}
