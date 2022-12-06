package questao17;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String cor = null;
		String tamanho = null;
		String tipo = null;
		int menu = 0;
		
		System.out.println( "O que deseja fazer?" + 
				"\n" + "1 - Registrar roupa" + 
				"\n" + "2 - Imprimir informaçoes da roupa" + 
				"\n" + "0 - sair");
		menu = entrada.nextInt();
		
		while(menu!=0){

            
	        
            switch (menu) {
                 case 1: {
                	 System.out.println("informe o tipo da produto");
                	 tipo = entrada.nextLine();
                	 
                	 System.out.println("informe o tamanho do produto");
                	 tamanho = entrada.nextLine();
                	 
                	 System.out.println("informe a cor do produto");
                	 cor = entrada.nextLine(); 
                	 Roupa rp1 = new Roupa(tamanho, cor, tipo);

                	 System.out.print(rp1.Imprimir());
                     break;

                } 
                case 2: {
                	System.out.println("informe o tipo da produto");
               	 
               	 
               	 	System.out.println("informe o tamanho do produto");
               	 
               	 
               	 	System.out.println("informe a cor do produto");
                    
                  
                    Roupa rp = new Roupa(tamanho, cor, tipo);
                    break;

                }
                case 0:{
                    break;
                }
                
            }
            System.out.println( "O que deseja fazer?" + 
            		"\n" + "1 - Registrar roupa" + 
            		"\n" + "2 - Imprimir informaçoes da roupa" + 
            		"\n" + "0 - sair");
            menu = entrada.nextInt();
		}
	}
}
