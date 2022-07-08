package função;

import java.util.Scanner;

public class atividade99 {
	public static double valor(double a1, double b1,double c1){
		double valor = 0;
		if(a1 > b1 && b1 > c1) {
			 valor = a1;
		}
		else if(b1 > c1 && c1 > a1) {
			valor = b1;
		}
		else if(c1 > a1 && a1 > b1) {
			valor = c1;
		}
		return valor;

	}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe valores");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	
	System.out.println("Maior valor: "+valor(a,b,c));
	
	}

}
