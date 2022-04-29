package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "..//out.txt";
		
		// FileWriter(path) -> cria sempre um arquivo
		// FileWriter(path, true) -> cria se não existir e grava a informação no final do arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line :  lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch ( IOException e) {
			e.printStackTrace();
		}

	}

}
