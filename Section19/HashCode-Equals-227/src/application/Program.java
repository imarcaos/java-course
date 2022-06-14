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
		/*
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		*/
		
		// example 3
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // return false, because that compare memory reference and then are different
		System.out.println(s1 == s2); // return true, because that consider a especial literal object and not a new creation of object (new Cliente....)
		
	}

}
