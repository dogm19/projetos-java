package questao17;

public class Calca extends Roupa {
	String social;
	String feminino;
	
	public Calca(String tamanho, String cor, String tipo, String camisa, String mangaLonga) {
		super(tamanho, cor, tipo);
	}
	
	public String Imprimir(){
        System.out.println(
        		"Tamanho: " + 
	        	super.getTamanho() + 
	        	"\n" + "Cor: " + 
	        	super.getCor() + 
	        	"\n" + "Marca: " + 
	        	super.getTipo() +
	        	"\n" + "Tipo: " + 
	        	social + 
	        	"\n" + feminino);
		return social;
    		
	}
}
