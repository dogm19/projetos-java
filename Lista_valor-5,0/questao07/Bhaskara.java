package questao07;

import java.util.Scanner;

public class Bhaskara {
    public double a;
    public double b;
    public double c;
    public Bhaskara() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        a = scan.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = scan.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = scan.nextDouble();
    }
    
    public double delta() {
        return (b*b)-(4*a*c);
    }
    public void raizes(double valordelta) {
        double x1=(-b+Math.sqrt(valordelta))/(2*a);
        double x2=(-b-Math.sqrt(valordelta))/(2*a);
        System.out.println("Valores das raizes = " + x1 + ", " + x2);
    }
}
