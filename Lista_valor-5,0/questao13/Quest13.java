package questao13;

import java.util.Scanner;

public class Quest13 {
	Scanner entrada = new Scanner(System.in);
	int[] solicitado = new int[20];
	int temporario = 0;
	
	public void ordemInverso() {
		System.out.println("Digite 20 numeros aleatorios");
		for(int i = 0; i < solicitado.length; i++){
			solicitado[i] = entrada.nextInt();
			
		}
		for (int i = 1; i < solicitado.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (solicitado[i] > solicitado[j]) {
		            int temporario = solicitado[i];
		            solicitado[i] = solicitado[j];
		            solicitado[j] = temporario;
		            System.out.println(solicitado[i] + "");
		        }
		    }
		
		for (int r = 0; r < solicitado.length; r++) {
		System.out.println("Valor da posição " + r + "\n-->" + solicitado[r]);
			}
		}
	}
}
