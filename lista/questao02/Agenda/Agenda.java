package Agenda;

import java.util.Scanner;

public class Agenda{
		Scanner scan = new Scanner(System.in);
		String[][] pessoa = new String[10][3];
	
	void armazenarPessoa(String nome, int idade, float altura) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o nome:");
			pessoa[i][0] = scan.nextLine();
			System.out.println("Digite a idade:");
			pessoa[i][1] = scan.nextLine();
			System.out.println("Digite a altura:");
			pessoa[i][2] = scan.nextLine();
		}
		

	}
}
