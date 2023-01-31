package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "test";
		String s2 = "test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1 == c3); // Compara os dois objetos de acordo com a sua posição na memória, e não deacordo com o conteúdo
		System.out.println(s1 == s2);
	}

}
