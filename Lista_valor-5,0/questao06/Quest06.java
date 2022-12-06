package questao06;

import java.util.Scanner;

public class Quest06 {
	 Scanner entrada = new Scanner(System.in);
	 double horasTrabalhadas;
     double Desconto;
     double TotalDesconto;
     double salarioLiquido;
     double salarioBruto;
     double valorHora;
     int formula = 100;
     
	
	    public void cauculoDeSalario() {

	        System.out.println("insira as horas trabalhadas");
	        horasTrabalhadas = entrada.nextDouble();

	        System.out.println("insira o valor da hora");
	        valorHora = entrada.nextDouble();

	        System.out.println("insira o percentual de desconto");
	        Desconto = entrada.nextDouble();

	        salarioBruto = horasTrabalhadas * valorHora;
	        TotalDesconto = Desconto / 100 / salarioBruto;
	        salarioLiquido = salarioBruto - TotalDesconto;

	        System.out.println("o salario bruto é = "+ salarioBruto + "\no totalDesconto é = "+TotalDesconto+ "\no salario liquido é = "+salarioLiquido);
	    }

}
