package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		// ex.230 - quando usamos uma classe do TreeSet, ela tem de ser uma implementação do Comparable
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
		}

	}

}
