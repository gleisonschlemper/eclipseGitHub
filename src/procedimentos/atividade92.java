package procedimentos;

import java.util.Scanner;

public class atividade92 {
 
	static void somar(int a, int b) {
		int soma = a + b;
		System.out.println(soma);
	}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe valor");
	int valor1 = input.nextInt();
	
	System.out.println("Informe valor");
	int valor2 = input.nextInt();
	
	somar(valor1, valor2);
	
	
	}

}
