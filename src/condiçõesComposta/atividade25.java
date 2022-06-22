package condiçõesComposta;

import java.util.Scanner;

public class atividade25 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite primeiro valor");
	int primeiro = input.nextInt();
	
	System.out.println("Digite segundo valor");
	int segundo = input.nextInt();
	
	if( primeiro > segundo) {
		System.out.println("O primeiro valor é o maior");
	}
	
	else if(primeiro < segundo) {
		System.out.println("O segundo valor é o maior");
	}
	
	else {
		System.out.println("Não existe valor maior, os dois são iguais");
	}
	
	
	
	
	
	
	
	
	}

}
