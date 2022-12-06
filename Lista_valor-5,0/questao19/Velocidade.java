package questao19;

import java.util.Scanner;

public class Velocidade extends Carro{
	Scanner entrada = new Scanner(System.in); 
	int velo;
	int marcha;
	int redMarcha;
	
	public Velocidade(
			String modelo, 
			String cor, 
			String marca, 
			String chassi, 
			String proprietario, 
			int ano,
			int numPortas, 
			int numMarchas, 
			double veloMaxima, 
			double veloAtual, 
			double volumeCombustível,
			boolean cambioAutomatico, 
			boolean tetoSolar) {
		
		super(
				modelo, 
				cor, 
				marca, 
				chassi, 
				proprietario, 
				ano, numPortas, 
				numMarchas, 
				veloMaxima, 
				veloAtual, 
				volumeCombustível,
				cambioAutomatico, 
				tetoSolar);
	}
	
	public void acelera() {
		
		System.out.println("1 - aumenta velocidade ");
		velo = entrada.nextInt();
		
		if(velo == 1) {
			this.veloMaxima = velo + 1;
			System.out.println(velo + "km/h");
		}
	}
	public void freiaCarro() {
		System.out.println("2 - freiar ");
		velo = entrada.nextInt();
		
		if(velo == 2) {
			this.veloMaxima = velo - velo;
			System.out.println(velo + "km/h");
		}
	}
	public void trocaMarcha() {
		System.out.println("(1)(2)(4)(5)");
		marcha = entrada.nextInt();
		
		if(marcha == 1) {
			System.out.println("marcha (1)");
		}
		else if(marcha == 2) {
			System.out.println("marcha (2)");
		}
		else if(marcha == 3) {
			System.out.println("marcha (3)");
		}
		else if(marcha == 4) {
			System.out.println("marcha (4)");
		}
		else if(marcha == 5) {
			System.out.println("marcha (5)");
		}
		else {
			System.out.println("========ERROR========");
		}
		
	}
	public void reduzirMarcha() {
		System.out.println("1 - reduzir");
		redMarcha = entrada.nextInt();
		
		if(redMarcha == 1) {
			System.out.println("marcha reduzida");
		}
	}

}
