package procedimentos;

import java.util.Scanner;

public class atividade93 {
	
	static void parOuImpar(int x) {
		if((x % 2)==0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String result = "sim";
	
	while(result.equalsIgnoreCase("sim")) {
		System.out.println("Informe valore");
		int valor = input.nextInt();
		parOuImpar(valor);
		
		System.out.println("Deseja continuar? \n"
				+ "sim ou não");
		result = input.next();
	}
	
	}
	

}
