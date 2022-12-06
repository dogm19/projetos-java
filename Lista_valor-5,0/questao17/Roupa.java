package questao17;

public class Roupa {
	String cor;
	String tamanho;
	String tipo;
		
	public Roupa (String tamanho, String cor, String tipo){
        this.tamanho = tamanho;
        this.cor = cor;
        this.tipo = tipo;
        
    }
    public String Imprimir(){
        return
			"Tamanho: " + 
			getTamanho() + 
			"\nCor: " + 
			getCor() +
	        "\nTipo: " + 
			getTipo(); 
    }
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setMarca(String tipo) {
		this.tipo = tipo;
	}
    
}
