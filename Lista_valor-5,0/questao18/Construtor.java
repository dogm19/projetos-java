package questao18;

public class Construtor {
	 public static void main(String[]args) {
	        Proprietario listagem = new Proprietario();	       
	        listagem.setNome("Dougrinhas");
	        listagem.setRg("67.463.725-10");
	        listagem.setCpf("123.456.454-45");
	        
	        
	        	System.out.println(
	        			"Nome: " + listagem.getNome() + 
	        			"\nCpf: " + listagem.getCpf() + 
	        			"\nRg: " + listagem.getRg());
	    }
}
