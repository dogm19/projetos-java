package questao19;

import java.util.Scanner;

public class Velocidade extends Carro{
	Scanner entrada = new Scanner(System.in); 
	int velo;
	int marcha;
	int autonomiaHora;
	int consumoKmPorHr;

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
			this.veloAtual = velo + 1;
			System.out.println(velo + "km/h");
		}
	}
	public void freiaCarro() {
		System.out.println("2 - freiar ");
		velo = entrada.nextInt();
		
		if(velo == 2) {
			this.veloAtual = velo - velo;
			System.out.println(velo + "km/h");
		}
	}
	public void trocaMarcha() {
		System.out.println("(1)(3)(2)(4)(5)");
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
			System.out.println("marcha (R)");
		}
		else {
			System.out.println("========ERROR========");
		}
		
	}
	public void marchaRe() {
        if (veloAtual != 0) {
            System.out.println("A marcha (R) nao pode ser engatada com velocidade superior a 0km!");
        }
        else{
            this.marcha = 6;
        }
    }

	public double autonomiaViagem(int consumoKmPorHr) {
        autonomiaHora = volumeCombustível / consumoKmPorHr;
        System.out.println("A autonomia de viagem é: " + autonomiaHora);
        return autonomiaHora;
    }

	public double getVolumeCombustível() {
		return volumeCombustível;
	}

	public String imprimir() {
        return "Info do veiculo: " + "\n Nome da marca: " + marca.getNome() + "\n Cor do carro: " + this.cor
                + "\n Numero do chassi: " + this.chassi + "\n Endereço do proprietario - " + " Casa: " + proprietario.getnCasa()
                + "\n Rua: " + proprietario.getRua() + "\n Bairro: " + proprietario.getBairro() + "\n Velocidade atual: "
                + this.veloAtual + "\n Velocidade Maxima: " + this.veloMaxima + "\n Numero de portas: "
                + this.numPortas + "\n Teto solar? " + this.tetoSolar + "\n Numero de marchas: " + this.numMarchas
                + "\n Cambio automatico? " + this.cambioAutomatico + "\n Volume de combustivel: "
                + this.volumeCombustivel;
    }

    public double getVeloAtual() {
        return veloAtual;
    }

    public int getMarcha() {
        return marcha;
    }
}
