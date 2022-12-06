package questao02;
import java.util.Scanner;
public class Quest02 {
	Scanner entrada = new Scanner(System.in);
	int numeroUm;
	int numeroDois;
		 
	    public void indetificacaoNumer() {

	        System.out.println("informe o primeiro numero");
	        numeroUm = entrada.nextInt();

	        System.out.println("informe o segundo numero");
	        numeroDois = entrada.nextInt();
        
	        
	        if (numeroUm==numeroDois){
	            
	           System.out.println("os numeros são iguais");
	        }

	        else if(numeroUm != numeroDois){
	            
	           System.out.println("os numeros são diferentes");

	        }

	        else if(numeroUm > numeroDois){
	            
	            System.out.println("o primeiro é maior");

	        }

	        else if (numeroUm < numeroDois){
	           
	            System.out.println("o segundo é maior");
	        }
	        else if (numeroUm >= numeroDois){
		           
	            System.out.println("o primeiro é maior");
	        }
	        else if (numeroUm <= numeroDois){
		           
	            System.out.println("o segundo é maior");
	        }

	    }
}
