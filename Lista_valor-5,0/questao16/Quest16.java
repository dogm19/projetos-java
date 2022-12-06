package questao16;

import java.util.Scanner;

public class Quest16 {
	Scanner scan = new Scanner(System.in);
	int quantidade;
	double ops1, ops2;
	double calculo;
	double pagamento;
	double bolacha = 3.5, papelHigienico12 = 15.5, cafe = 8.2, batataCongelada2kg = 23, yorgute = 4.6;
	
	public void mercado() {
		
		System.out.println("escolha a seguir");
		System.out.println("1 - Ver lista");
		System.out.println("2 - Comprar produtos");
		ops1 = scan.nextDouble();
		
		if(ops1 == 1) {
			
			System.out.println("1 = bolacha - 3.50 = 1500qnt");
			System.out.println("2 = papelHigienico12 - 15.50 = 1000qnt");
			System.out.println("3 = cafe - 8.20 = 1000qnt");
			System.out.println("4 = batataCongelada2kg - 23.00 = 1000qnt");
			System.out.println("5 = yorgute - 4.60 = 1000qnt");
			
		}
		
		else if(ops1 == 2) {
			
			System.out.println("Digite o codigo do produto ");
			ops2 = scan.nextDouble();
			
			System.out.println("Digite a quantidade do produto");
			quantidade = scan.nextInt();
			
			
			if(ops2 == 1) {
				calculo = bolacha * quantidade;
				
				System.out.println("o total da compra é: " + calculo);
				
				System.out.println("Como irá pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto: " + bolacha);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto: " + bolacha);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto: " + bolacha);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Dinheiro");
				}
				
				
			}
			
			if(ops2 == 2) {
				calculo = papelHigienico12 * quantidade;
				
				System.out.println("o total da compra é: " + calculo);
				
				System.out.println("Como irá pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto: " + papelHigienico12);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto: " + papelHigienico12);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto: " + papelHigienico12);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Dinheiro");
				}
			}
			
			if(ops2 == 3) {
				calculo = cafe * quantidade;
				
				System.out.println("o total da compra é: "+ calculo);
				
				System.out.println("Como irá pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto: " + cafe);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto: " + cafe);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto: " + cafe);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Dinheiro");
				}
			}
			
			if(ops2 == 4) {
				calculo = batataCongelada2kg * quantidade;
				
				System.out.println("o total da compra é: " + calculo);
				
				System.out.println("Como deseja pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto: " + batataCongelada2kg);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto: " + batataCongelada2kg);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto: " + batataCongelada2kg);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Dinheiro");
				}
			}
			
			if(ops2 == 5) {
				calculo = yorgute * quantidade;
				
				System.out.println("o total da compra é: "+ calculo);
				
				System.out.println("Como deseja pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto: " + yorgute);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto: " + yorgute);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento via: Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto: " + yorgute);
					System.out.println("Quantidade: " + quantidade);
					System.out.println("Total da compra: " + calculo);
					System.out.println("Pagamento: Dinheiro");
				}
			}
		}
	}
}

