package questao11;

import java.util.Scanner;

public class Quest11 {
		
	public static void opcoes() {
		
		Scanner entrada = new Scanner(System.in);
		int opcao;
		System.out.println("1 = Para tabuada de adição");
		System.out.println("2 = Para tabuada de multiplicação");
		opcao = entrada.nextInt();
		
		if(opcao == 1) {
			tabuadaAdicao();
		}
		else if(opcao == 2) {
			TabuadaMultiplicacao();
		}
				
	}
	public static void tabuadaAdicao() {
		
        	System.out.println("======================TABUADA DE ADIÇÃO=========================\n\n");      	
        	System.out.println("0 + 0 = 0  |  1 + 0 = 1  |  2 + 0 = 2  |  3 + 0 = 3  |  4 + 0 = 4   ");
        	System.out.println("0 + 1 = 1  |  1 + 1 = 2  |  2 + 1 = 3  |  3 + 1 = 4  |  4 + 1 = 5   ");
        	System.out.println("0 + 2 = 2  |  1 + 2 = 3  |  2 + 2 = 4  |  3 + 2 = 5  |  4 + 2 = 6   ");
        	System.out.println("0 + 3 = 3  |  1 + 3 = 4  |  2 + 3 = 5  |  3 + 3 = 6  |  4 + 3 = 7   ");
        	System.out.println("0 + 4 = 4  |  1 + 4 = 5  |  2 + 4 = 6  |  3 + 4 = 7  |  4 + 4 = 8   ");
        	System.out.println("0 + 5 = 5  |  1 + 5 = 6  |  2 + 5 = 7  |  3 + 5 = 8  |  4 + 5 = 9   ");
        	System.out.println("0 + 6 = 6  |  1 + 6 = 7  |  2 + 6 = 8  |  3 + 6 = 9  |  4 + 6 = 10  ");
        	System.out.println("0 + 7 = 7  |  1 + 7 = 8  |  2 + 7 = 9  |  3 + 7 = 10 |  4 + 7 = 11  ");
        	System.out.println("0 + 8 = 8  |  1 + 8 = 9  |  2 + 8 = 10 |  3 + 8 = 11 |  4 + 8 = 12  ");
        	System.out.println("0 + 9 = 9  |  1 + 9 = 10 |  2 + 9 = 11 |  3 + 9 = 12 |  4 + 9 = 13  ");
        	System.out.println("====================================================================");
        	System.out.println("5 + 0 = 5  |  6 + 0 = 6  |  7 + 0 = 7  |  8 + 0 = 8  |  9 + 0 = 9   ");
        	System.out.println("5 + 1 = 6  |  6 + 1 = 7  |  7 + 1 = 8  |  8 + 1 = 9  |  9 + 1 = 10  ");
        	System.out.println("5 + 2 = 7  |  6 + 2 = 8  |  7 + 2 = 9  |  8 + 2 = 10 |  9 + 2 = 11  ");
        	System.out.println("5 + 3 = 8  |  6 + 3 = 9  |  7 + 3 = 10 |  8 + 3 = 11 |  9 + 3 = 12  ");
        	System.out.println("5 + 4 = 9  |  6 + 4 = 10 |  7 + 4 = 11 |  8 + 4 = 12 |  9 + 4 = 13  ");
        	System.out.println("5 + 5 = 10 |  6 + 5 = 11 |  7 + 5 = 12 |  8 + 5 = 13 |  9 + 5 = 14  ");
        	System.out.println("5 + 6 = 11 |  6 + 6 = 12 |  7 + 6 = 13 |  8 + 6 = 14 |  9 + 6 = 15  ");
        	System.out.println("5 + 7 = 12 |  6 + 7 = 13 |  7 + 7 = 14 |  8 + 7 = 15 |  9 + 7 = 16  ");
        	System.out.println("5 + 8 = 13 |  6 + 8 = 14 |  7 + 8 = 15 |  8 + 8 = 16 |  9 + 8 = 17  ");
        	System.out.println("5 + 9 = 14 |  6 + 9 = 15 |  7 + 9 = 16 |  8 + 9 = 17 |  9 + 9 = 18  ");	
	}
	public static void TabuadaMultiplicacao() {
		
		System.out.println("======================TABUADA DE MULTIPLICAÇÃO==================\n\n");        	
    	System.out.println("1 x 1 = 1  |  2 x 1 = 2  |  3 x 1 = 3  |  4 x 1 = 4  |  5 x 1 = 5   ");
    	System.out.println("1 x 2 = 2  |  2 x 2 = 4  |  3 x 2 = 6  |  4 x 2 = 8  |  5 x 2 = 10  ");
    	System.out.println("1 x 3 = 3  |  2 x 3 = 6  |  3 x 3 = 9  |  4 x 3 = 12 |  5 x 3 = 15  ");
    	System.out.println("1 x 4 = 4  |  2 x 4 = 8  |  3 x 4 = 12 |  4 x 4 = 16 |  5 x 4 = 20  ");
    	System.out.println("1 x 5 = 5  |  2 x 5 = 10 |  3 x 5 = 15 |  4 x 5 = 20 |  5 x 5 = 25  ");
    	System.out.println("1 x 6 = 6  |  2 x 6 = 12 |  3 x 6 = 18 |  4 x 6 = 24 |  5 x 6 = 30  ");
    	System.out.println("1 x 7 = 7  |  2 x 7 = 14 |  3 x 7 = 21 |  4 x 7 = 28 |  5 x 7 = 35  ");
    	System.out.println("1 x 8 = 8  |  2 x 8 = 16 |  3 x 8 = 24 |  4 x 8 = 32 |  5 x 8 = 40  ");
    	System.out.println("1 x 9 = 9  |  2 x 9 = 18 |  3 x 9 = 27 |  4 x 9 = 36 |  5 x 9 = 45  ");
    	System.out.println("1 x 10 = 10|  2 x 10 = 20|  3 x 10 = 30|  4 x 10 = 40|  5 x 10 = 50 ");
    	System.out.println("====================================================================");
    	System.out.println("6 x 1 = 6  |  7 x 1 = 7  |  8 x 1 = 8  |  9 x 1 = 9  |  10 x 1 = 10  ");
    	System.out.println("6 x 2 = 12 |  7 x 2 = 14 |  8 x 2 = 16 |  9 x 2 = 18 |  10 x 2 = 20  ");
    	System.out.println("6 x 3 = 18 |  7 x 3 = 21 |  8 x 3 = 24 |  9 x 3 = 27 |  10 x 3 = 30  ");
    	System.out.println("6 x 4 = 24 |  7 x 4 = 28 |  8 x 4 = 32 |  9 x 4 = 36 |  10 x 4 = 40  ");
    	System.out.println("6 x 5 = 30 |  7 x 5 = 35 |  8 x 5 = 40 |  9 x 5 = 45 |  10 x 5 = 50  ");
    	System.out.println("6 x 6 = 36 |  7 x 6 = 42 |  8 x 6 = 48 |  9 x 6 = 54 |  10 x 6 = 60  ");
    	System.out.println("6 x 7 = 42 |  7 x 7 = 49 |  8 x 7 = 56 |  9 x 7 = 63 |  10 x 7 = 70  ");
    	System.out.println("6 x 8 = 48 |  7 x 8 = 56 |  8 x 8 = 64 |  9 x 8 = 72 |  10 x 8 = 80  ");
    	System.out.println("6 x 9 = 54 |  7 x 9 = 63 |  8 x 9 = 72 |  9 x 9 = 81 |  10 x 9 = 90  ");
    	System.out.println("6 x 10 = 60|  7 x 10 = 70|  8 x 10 = 80|  9 x 10 = 90|  10 x 10 = 100");
	}
}
