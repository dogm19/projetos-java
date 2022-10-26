package Predio;

public class Elevador {
	int sobe, desce;
	
	public void inicializa() {
		int capacidade = 0;
		int andares = 0;
	}
	public void entra() {
		
	}
	
	public int getSobe() {
		return sobe;
	}
	public void setSobe(int sobe) {
		this.sobe = sobe;
	}
	public int getDesce() {
		return desce;
	}
	public void setDesce(int desce) {
		this.desce = desce;
	}
	
	public void subirAndar(Elevador e){
		    e.setSobe(e.getSobe() + 1);
	}

	public void descerAndar(Elevador e){
		 	e.setDesce(e.getDesce() - 1);
	}
}
