package questao14;

import java.util.ArrayList;

public class Quest14 {
	 String modelo; 
	 String memoria;
	 String armazenamento;
	 String processador;
	 String placaDeVideo;
	 ArrayList<Quest14> listaQ14 = new ArrayList<>();
	
	public Quest14(
			String modelo, 
			String memoria, 
			String armazenamento, 
			String processador, 
			String placaDeVideo) {
		this.modelo = modelo;
		this.memoria = memoria;
		this.armazenamento = armazenamento;
		this.processador = processador;
		this.placaDeVideo = placaDeVideo;
		
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

}
