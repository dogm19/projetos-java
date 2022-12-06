package questao14;

import java.util.ArrayList;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Opcoes {
	ArrayList<Quest14> listaQ14 = new ArrayList();
	int indice = -1;
	
	public void cadastrarComputador(
			String modelo,
			String memoria, 
			String armazenamento, 
			String processador, 
			String placaDeVideo) {
		
		Quest14 q14b = new Quest14(modelo, memoria, armazenamento, processador, placaDeVideo);
		listaQ14.add(q14b);
		++indice;
	}
	
	public void upgrade(
			String memoria, 
			String armazenamento, 
			String processador, 
			String placaDeVideo,
			int codigoPc) {
		
		listaQ14.get(codigoPc).setMemoria(memoria);
		listaQ14.get(codigoPc).setArmazenamento(armazenamento);
		listaQ14.get(codigoPc).setProcessador(processador);
		listaQ14.get(codigoPc).setPlacaDeVideo(placaDeVideo);
	}
	
	public void removerComputador(int codigoPc) {
		listaQ14.remove(codigoPc);
	}
	public String imprimir(){
	      return 
	    	"modelo: " + 
			listaQ14.get(indice).getModelo() + 
			"\n" + "memoria: " + 
			listaQ14.get(indice).getMemoria() + 
			"\n" + "armazenamento: " + 
			listaQ14.get(indice).getArmazenamento() + 
			"\n" + "processador: " + 
			listaQ14.get(indice).getProcessador()+ 
			"\n" + "placa de video: " + 
			listaQ14.get(indice).getPlacaDeVideo() + 
			"\n" + "codigo do computador registrado: " + 
			indice;
	    }

	public Object imprimirPorIndice(int codigoPc) throws IOException{
		try{
            return 
            	"modelo: " 
        		+ listaQ14.get(codigoPc).getModelo() + 
        		"\n" + "memoria: " + 
        		listaQ14.get(codigoPc).getMemoria() + 
        		"\n" + "armazenamento: " + 
        		listaQ14.get(codigoPc).getArmazenamento() + 
        		"\n" + "processador: " + 
        		listaQ14.get(codigoPc).getProcessador()+ 
        		"\n" + "placa de video: " 
        		+ listaQ14.get(codigoPc).getPlacaDeVideo();
		}
	    catch(RuntimeException e){
	    }
	    return "Algo errado aconteceu";
	}	
}
