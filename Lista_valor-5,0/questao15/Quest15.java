package questao15;

import java.util.Scanner;

public class Quest15 {
	Scanner scan = new Scanner(System.in);
	String livro, nome;
	
	    public void livro() {
	        
	        System.out.println("Digite o seu nome");
	        nome = scan.nextLine();
	        
	        System.out.println("Digite o nome do livro");
	        livro = scan.nextLine();

	        System.out.println("  Aqui está = o livro " +livro+ "  será emprestado para: " +nome);
	        }
}
