package questao14;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		Opcoes ops = new Opcoes();
		int acoes;
		String modelo;
        String memoria;
        String armazenamento;
        String processador;
        String placaDeVideo;
        int codigoPc;

        acoes = Integer.parseInt(JOptionPane.showInputDialog(null, 
        		"O que deseja fazer?" + 
        		"\n" + "1- Cadastrar computador" + 
        		"\n" + "2- Dar upgrade no computador " + 
        		"\n" + "3- Remover computador" + 
        		"\n" + "4- Imprimir computador" + 
        		"\n" + "0- Sair"));
        while(acoes!=0) {
        	switch (acoes) {
        		case 1:{
        			modelo = JOptionPane.showInputDialog(null, "Informe o modelo do computador: ");
                    memoria = JOptionPane.showInputDialog(null, "Informe a memoria do computador: ");
                    armazenamento = JOptionPane.showInputDialog(null, "Informe o armazenamento do computador: ");
                    processador = JOptionPane.showInputDialog(null, "Informe o processador do computador: ");
                    placaDeVideo = JOptionPane.showInputDialog(null, "Informe a placa de video do computador: ");
                    ops.cadastrarComputador(modelo, memoria, armazenamento, processador, placaDeVideo);
                    JOptionPane.showMessageDialog(null, "Dados do pc cadastrado: " + "\n" + ops.imprimir());
        			break;
        		}
        		case 2:{
                    memoria = JOptionPane.showInputDialog(null, "Informe a memoria do upgrade: ");
                    armazenamento = JOptionPane.showInputDialog(null, "Informe o armazenamento do upgrade: ");
                    processador = JOptionPane.showInputDialog(null, "Informe o processador do upgrade: ");
                    placaDeVideo = JOptionPane.showInputDialog(null, "Informe a placa de video do upgrade: ");
                    codigoPc = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o cód do pc a ser fazer o upgrade: "));
                    ops.upgrade(memoria, armazenamento, processador, placaDeVideo, codigoPc);
                    JOptionPane.showMessageDialog(null, ops.imprimir());
                    break;
        		}
        		case 3:{
                    codigoPc = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o cód do computador a ser removido: "));
                    ops.removerComputador(codigoPc);
				    JOptionPane.showMessageDialog(null, "Computador removido com sucesso!!");
				    break;
                }
        		case 4:{
                    codigoPc = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o cód do computador: "));
                    JOptionPane.showMessageDialog(null,ops.imprimirPorIndice(codigoPc));
                    break;
                }
        	}
        	acoes = Integer.parseInt(JOptionPane.showInputDialog(null, 
        			"Qual operacao deseja fazer?" + 
        			"\n" + "1- Cadastrar um computador" + 
        			"\n" + "2- Dar upgrade no computador cadastrado " + 
        			"\n" + "3- Remover computador" + 
        			"\n" + "4- Imprimir dados" + 
        			"\n" + "0- Sair"));
        }
	}

}
