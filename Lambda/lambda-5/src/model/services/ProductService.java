package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	
	// incui o predicado na função para que ela fique mais versatil na hora de chamar a função que define qual o filtro que será utilizado
	public double filteredSum(List<Product> list, Predicate<Product> criteria) { 
		double sum = 0.0;
		for (Product p: list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
