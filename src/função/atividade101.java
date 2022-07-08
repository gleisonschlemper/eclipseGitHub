package função;

import java.util.Scanner;

public class atividade101 {

	public static double potencia(int a, int b) {
	double valor = Math.pow(a, b);
	return valor;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe base da potência");
		int base = input.nextInt();
		
		System.out.println("Informe expoente da potência");
		int expoente = input.nextInt();
		
		System.out.println("Valor da potência: "+potencia(base,expoente));
		
	}

}
