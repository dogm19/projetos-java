package questao08;

import java.util.Scanner;

public class Quest08 {
	Scanner entrada = new Scanner(System.in);
	double raio;
	double volume;
    
	
	public void caucularRaio() {
		
        System.out.println("insira o raio da esfera");
        raio = entrada.nextDouble();

        volume = 4 * 3.14 * raio * raio *raio / 3;

	    if(raio < 0){
	        System.out.println("Burro!!!");
	    }
	    
	    else{
	        System.out.println("volume da esfera\n= " + volume);
	    }

	}
}
