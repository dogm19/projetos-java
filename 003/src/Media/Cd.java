package Media;

import java.util.Scanner;

public class Cd {
	String nome;
	String data;
	String autor;
	
	void dadosCd(){
		Scanner scan = new Scanner(System.in);
		nome = "Ride the Lightning";
		data = "1989";
		autor = "Metalica";
		System.out.println("Nome: " + nome +"\nAutor: " + autor + "\nAno: " + data);
		System.out.println("-----------------------------------");
	}
	void musicaTocar(){
		
	}
}
