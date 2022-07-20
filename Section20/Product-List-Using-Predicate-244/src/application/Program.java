package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		//1 - Utilizando Implementação de Interface
		// ProductPredicate
		
		//2 - Utilizando referência para método - Method Reference
		//list.removeIf(Product::staticProductPredicate);
		
		//3 - Utilizando referência para método não estático - Method Reference No Static
		//list.removeIf(Product::nonStaticProductPredicate);
		
		//4 - Utilizando expressão lambda declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		list.removeIf(pred);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
