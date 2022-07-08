package procedimentos;

import java.util.Scanner;

public class atividade91 {
	
	static void maior(int a, int b) {
		if(a > b) {
			System.out.println("Maior: "+a);
		}
		
		else if(a < b) {
			System.out.println("Maior: "+b);
		}
		
		else if(a == b) {
			System.out.println("Valores iguais");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.println("Informe valor");
		int valor1 = input.nextInt();
		
		System.out.println("Informe valor");
		int valor2 = input.nextInt();
		
		
		maior(valor1, valor2);
		
	}

}
