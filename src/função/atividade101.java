package fun��o;

import java.util.Scanner;

public class atividade101 {

	public static double potencia(int a, int b) {
	double valor = Math.pow(a, b);
	return valor;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe base da pot�ncia");
		int base = input.nextInt();
		
		System.out.println("Informe expoente da pot�ncia");
		int expoente = input.nextInt();
		
		System.out.println("Valor da pot�ncia: "+potencia(base,expoente));
		
	}

}
