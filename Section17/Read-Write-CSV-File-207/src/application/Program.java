package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String path = sc.nextLine();
		
		// files in -> //files//in.csv
		File sourceFile = new File(path);
		//String sourceFolder = sourceFile.getParent();
		
		// cria o novo diretorio dentro da pasta files, se criado com sucesso retorna true
		//boolean success = new File(sourceFolder + "//out").mkdir();
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
			String itemCsv = br.readLine();
			
			while (itemCsv != null) {
				System.out.println(itemCsv);
				itemCsv = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
