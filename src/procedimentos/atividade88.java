package procedimentos;

import java.util.Scanner;

public class atividade88 {
	
	static void somar(int a1, int a2) {
	int valor = a1 + a2;
	System.out.println("Valor informado: "+valor);
	}
	
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int array [] = new int [2];
	
	
	for(int i=0; i<2; i++) {
		System.out.println("informe valor "+(i + 1));
		array[i] = input.nextInt();
		
	}
	somar(array[0], array[1]);
	

	}

}
