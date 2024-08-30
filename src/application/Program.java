package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// obtendoCaminhoDoArquivo
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Acessar somente o nome do arquivo e não o caminho completo
		System.out.println("getName: " + path.getName());
		
	
	
		sc.close();
	}

}
