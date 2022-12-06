package questao07;

import java.util.Scanner;

public class Quest07 {
	
	public static void main(String[] args) {
	 	Bhaskara objeto = new Bhaskara();
        double valordelta = objeto.delta();
        System.out.println("Delta = " + valordelta);
        if (valordelta<0) System.out.print("Delta menor que zero");
        else objeto.raizes(valordelta);
        System.out.println();  
    }
	
}
