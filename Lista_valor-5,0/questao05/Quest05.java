package questao05;
import java.util.Scanner;

public class Quest05 {
	Scanner entrada = new Scanner(System.in);
	int premioM;

	
	public void PremioMercado() {

	    System.out.println("Escolha um numero da sorte de 1 a 9 pode vir os melheres premios se tiver sorte!!! ");
	    premioM = entrada.nextInt();
	    
	
	    if(premioM == 1) {
	    	System.out.println("Você ganhou um carro (sorte da porra viu)");
	    }
	    
	    else if (premioM == 2){
	    	System.out.println("Você ganhou uma bicicleta (sorte ok)");
	    }
	    
	    else if (premioM == 3){
	    	System.out.println("Você ganhou uma moto (diabo de sorte boa)");
	    }
	    
	    else if (premioM == 4){
	    	System.out.println("Você ganhou uma bola (pura humilhação kkkk)");
	    } 
	    
	    else if (premioM == 5){
	    	System.out.println("Você ganhou uma panela (ai é sacanagem so pode)");
	    }
	    
	    else if (premioM == 6){
	    	System.out.println("Você ganhou um videogame (será que é um playstation5)");
	    }
	    else if (premioM == 7){
	    	System.out.println("Você ganhou uma TV (tem que ser pelo menos 4k 80polegadas)");
	    }
	    else if (premioM == 8){
	    	System.out.println("Você ganhou um computador (queria um gamer)");
	    }
	    else if(premioM == 9) {
	    	System.out.println("Você ganhou um celular (android ou ios?)");  
	    }
	    
	    else {
	    	
	    	System.out.println("Numero é de 1 a 9 ou você é burro!!!");
	    }
	}

}
