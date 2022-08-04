package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
<<<<<<< HEAD
=======
import java.util.function.Function;
import java.util.stream.Collectors;
>>>>>>> ex257v1

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		
		//Class 257 - Function<Product, String>
		// vamos usar a função "map" diferente da "Map" de estrutura de dados
		// a função map gera uma nova stream
		// v5 - Lambda Expression InLine
				
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
	}

}
