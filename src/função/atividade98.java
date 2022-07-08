package função;

import java.util.Scanner;

public class atividade98 {
	public static double media(double a, double b) {
		return (a + b)/2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe seu nome");
		String nome = input.next();
		
		System.out.println("Informe as notas");
		double valor1 = input.nextDouble();
		double valor2 = input.nextDouble();
		
		System.out.println("Aluno "+nome+" Media: "+media(valor1,  valor2));
	}

}
