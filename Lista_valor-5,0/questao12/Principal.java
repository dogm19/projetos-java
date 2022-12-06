package questao12;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner menu = new Scanner (System.in);
		Quest12 q12 = new Quest12();

        int opcao;
        
        do{
        	q12.tela();
            opcao = menu.nextInt();
            
            switch(opcao){
            case 1:
           	 System.out.println("Você aprendeu");
                break;
                
            case 2:
           	 System.out.println("Você escreveu");
                break;
                
            case 3:
           	 System.out.println("Você falou");
                break;                
            
            default:
                System.out.println("O programa foi encerrado!!!");
            }
        } while(opcao != 0);
    }
}

