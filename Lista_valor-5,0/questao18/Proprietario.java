package questao18;

public class Proprietario {
	    private String Nome;
	    private String Rg;
	    private String Cpf;
	    private String Datadenascimento;
	    private String Rua;
	    private String Bairro;
	    private String Cidade;
	    private String Estado;

	    
	    
	    public void cadastroP(String Nome, String Rg,String Cpf, String Datadenascimento, String Rua, String Bairro, String Cidade, String Estado) {
	    	this.Nome = Nome;
	    	this.Rg = Rg;
	    	this.Cpf = Cpf;
	    	this.Bairro = Bairro;
	    	this.Cidade = Cidade;
	    	this.Datadenascimento = Datadenascimento;
	    	this.Rua = Rua;
	    }



		public String getNome() {
			return Nome;
		}



		public void setNome(String nome) {
			Nome = nome;
		}



		public String getRg() {
			return Rg;
		}



		public void setRg(String rg) {
			Rg = rg;
		}



		public String getCpf() {
			return Cpf;
		}



		public void setCpf(String cpf) {
			Cpf = cpf;
		}



		public String getDatadenascimento() {
			return Datadenascimento;
		}



		public void setDatadenascimento(String datadenascimento) {
			Datadenascimento = datadenascimento;
		}



		public String getRua() {
			return Rua;
		}



		public void setRua(String rua) {
			Rua = rua;
		}



		public String getBairro() {
			return Bairro;
		}



		public void setBairro(String bairro) {
			Bairro = bairro;
		}



		public String getCidade() {
			return Cidade;
		}



		public void setCidade(String cidade) {
			Cidade = cidade;
		}



		public String getEstado() {
			return Estado;
		}



		public void setEstado(String estado) {
			Estado = estado;
		}
	        
	    
}
