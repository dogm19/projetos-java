package quastao01;

import java.util.Scanner;

public class Quest01 {
	Scanner entrada = new Scanner(System.in);
	double distancia;
	double tempo;
	double velocidade;
	double litros;
	double autonomia = 12;

	
	public void questaoUmCauculo() {
		System.out.println("Digite o tempo gasto ");
		tempo =	entrada.nextDouble();
		System.out.println("Digite a velocidade percorrida ");
		velocidade = entrada.nextDouble();
		
		distancia = tempo * velocidade;
		litros = distancia / autonomia;
		
		System.out.println("\n\nResultados\n\n");
		System.out.println("Velocidade media = " + velocidade + "Km/h\n");
		System.out.println("Tempo gasto = " + tempo + "horas\n");
		System.out.println("Distancia percorrida = " + distancia + "Km/n");
		System.out.println("Combustivel utilizado: " + litros + "litros\n");
		
	}
	
}
