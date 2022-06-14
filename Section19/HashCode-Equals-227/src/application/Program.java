package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		// example 1
/*
		String a = "Maria";
		String b = "Alex";
		
		// return false
		System.out.println(a.equals(b));
		
		System.out.println();
		// return a hashcode
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
*/
		
		// example 2
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
	}

}
