package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		// caminho de uma pasta ou arquivo "path"
		File path = new File(strPath);
		
		// carrega o caminho das pastas contindas no caminho indicado
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Carrega o caminho dos arquivos contidos no caminho indicado
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		// Cria um subpasta a partir do caminho indicado
		// "subdir" colocamos o nome que quiser para a nossa pasta
		boolean success = new File(strPath + "//subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
