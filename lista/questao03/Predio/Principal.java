package Predio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Elevador elev = new Elevador();
		
		int terreo = 0;
		
		while(terreo == 0) {
			
			int opcao = 10;
			System.out.println("Escolha uma opção (1 Subir e 2 Descer) ");
			opcao = scan.nextInt();
			
			switch(opcao = 10){
			case 1:
	          elev.subirAndar(elev);
	          break;
	        case 2:
	          elev.descerAndar(elev);
	          break;
	        case 3:
	          
	          break;
	      }
		}
	}

}
