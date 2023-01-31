package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebbok", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/* Comparator<Product> comp = new Comparator<Product>() { // classe anônima dentro do programa principal

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toString().compareTo(p2.getName().toUpperCase());
						
			}
		
		};*/
		
		
		Comparator<Product> comp = (p1, p2) -> p1.getName().toString().compareTo(p2.getName().toUpperCase()); // utilizando expressões lambda - função anônima (arrow function)
		
		
		// 2 formas de ordenar a classe com a Comparator
		list.sort(new MyComparator()); // utilizar o comparator da classe MyComparator 
		list.sort(comp); // utilizar o Comparator da classe anônima do próprio programa principal 

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
