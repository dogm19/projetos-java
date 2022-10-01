package Media;

public class principal {

	public static void main(String[] args) {
		Cd cd = new Cd();
		Dvd dvd = new Dvd();
		Jogo jogo = new Jogo();
		DvdPlayer playerD = new DvdPlayer();
		CdPlayer playerC = new CdPlayer();
		Console playerV = new Console();
		
		System.out.println("Bem vindo ao InfoMedia");
		System.out.println("-----------------------------------");
		
		System.out.println("Info das Midias");
		System.out.println("");
		cd.dadosCd();
		cd.musicaTocar();
		dvd.dadosDvd();
		dvd.alugarDvd();
		jogo.dadosJogo();
		jogo.tipoJogo();
		System.out.println("Info Do Players");
		playerC.dadosDvdPlayer();
		playerC.reproduzirCd();
		playerD.dadosDvdPlayer();
		playerD.reproduzirDvd();
		playerV.dadosConsole();
		playerV.executarJogo();
	}

}
