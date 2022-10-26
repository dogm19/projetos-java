package Tv;

import java.util.Scanner;

public class Principal{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Televisao tvisao = new Televisao(0, 0);
    Controle c1 = new Controle();

    int resposta = 7;

    while ( resposta == 7 ){

      int opcao;
      
      System.out.println("Digite o que gostaria de fazer: ");
      
      System.out.println("Volume (1 +) ou (2 -)");
      System.out.println("Canal (3 +) ou (4 -)");
      System.out.println("Escolher canal (5)");
      System.out.println("Ver volume e canal (6)");
      opcao = scan.nextInt();

      switch(opcao){
        case 1:
          c1.aumentarVolume(tvisao);
          break;
        case 2:
          c1.diminuirVolume(tvisao);
          break;
        case 3:
          c1.aumentarCanal(tvisao);
          break;
        case 4:
          c1.diminuirCanal(tvisao);
          break;
        case 5:
          c1.escolherCanal(tvisao);
          break;
        case 6:
          c1.visualizar(tvisao);
          break;
      }
      System.out.println("Continuar(7) Desligar(8) ");
      resposta = scan.nextInt();
      if( resposta != 7 ){
    	  System.out.println("====================================================");
    	  System.out.println("Canal: " + tvisao.getCanal());
    	  System.out.println("Volume: " + tvisao.getVolume());
        }
    }

  }
  
}
