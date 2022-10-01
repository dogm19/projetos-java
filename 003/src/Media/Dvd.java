package Media;

public class Dvd {
	String nome;
	String genero;
	String lancamento;
	
	void dadosDvd(){
		System.out.println("Nome Do DVD");
		nome = "Logan";
		lancamento = "2017";
		genero = "Ação, Drama, Suspense...";
		System.out.println("Nome: " + nome +"\nGenero: " + genero + "\nAno: " + lancamento);
		System.out.println("-----------------------------------");
	}
	void alugarDvd(){
		
	}
}
