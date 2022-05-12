package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		// files in -> files//in.csv
		System.out.println("Enter a file path: ");
		String path = sc.nextLine();
				
		File sourceFile = new File(path);
		String sourceFolder = sourceFile.getParent();
		
		// cria o novo diretorio dentro da pasta files, se criado com sucesso retorna true
		new File(sourceFolder + "//out").mkdir();
		
		// cria e escreve no arquivo descrito no exercicio
		String targetFile = sourceFolder + "//out//summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
			String itemCsv = br.readLine();
			
			while (itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				 
				itemCsv = br.readLine();
			}
						
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
				
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFile + " CREATED!");
			}
			
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
