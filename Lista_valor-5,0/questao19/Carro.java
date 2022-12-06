package questao19;

public class Carro {
	 String modelo, cor, marca, chassi, proprietario; 
	 int ano, numPortas, numMarchas = 5;
	 double veloMaxima, veloAtual, volumeCombustível; 
	 boolean cambioAutomatico, tetoSolar;
	 
	public Carro(String modelo, String cor, String marca, String chassi, String proprietario, int ano, int numPortas,
			int numMarchas, double veloMaxima, double veloAtual, double volumeCombustível, boolean cambioAutomatico,
			boolean tetoSolar) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
		this.chassi = chassi;
		this.proprietario = proprietario;
		this.ano = ano;
		this.numPortas = numPortas;
		this.numMarchas = numMarchas;
		this.veloMaxima = veloMaxima;
		this.veloAtual = veloAtual;
		this.volumeCombustível = volumeCombustível;
		this.cambioAutomatico = cambioAutomatico;
		this.tetoSolar = tetoSolar;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public int getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	public double getVeloMaxima() {
		return veloMaxima;
	}
	public void setVeloMaxima(double veloMaxima) {
		this.veloMaxima = veloMaxima;
	}
	public double getVeloAtual() {
		return veloAtual;
	}
	public void setVeloAtual(double veloAtual) {
		this.veloAtual = veloAtual;
	}
	public double getVolumeCombustível() {
		return volumeCombustível;
	}
	public void setVolumeCombustível(double volumeCombustível) {
		this.volumeCombustível = volumeCombustível;
	}
	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}
	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	public boolean isTetoSolar() {
		return tetoSolar;
	}
	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	
	 
	 
}
