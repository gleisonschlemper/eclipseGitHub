package condiçõesBásica;

import java.util.Scanner;

public class atividade20 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
   
	System.out.println("Digite um valor");
	int valor = input.nextInt();
	
	if((valor % 2) == 0) {
		System.out.println("Par");
	}
	else {
		System.out.println("Impar");
	}
	
	}

}
