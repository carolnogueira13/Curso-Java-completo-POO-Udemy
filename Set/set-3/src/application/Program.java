package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
		/* O resultado é false porque como a classe Product não tem a implementação de 
		hashCode e equals, a aspecto de comparação será baseado nos posnteiros da memória 
		e como o prod apresenta um endereço na memória diferente do set, o resultado é false
		que o prod não está contido no set. Caso implemmentasse o hashCode e equals na classe 
		Product o resultado seria true*/

	}

}
