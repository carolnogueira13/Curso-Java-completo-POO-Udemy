package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));
		
		// Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		// list.removeIf(new ProductPredicate()); // Implementação da interface
		// list.removeIf(Product :: staticProductPredicate); // Referância para o método static na classe Product
		// list.removeIf(Product :: nonstaticProductPredicate); // Referência para método não static na classe Product
		// list.removeIf(pred); // Expressão lambda declarada
		list.removeIf(p -> p.getPrice() >= 100.0); // Expressão lambda inline
		
		
		for (Product p: list) {
			System.out.println(p);
		}
		

	}

}
