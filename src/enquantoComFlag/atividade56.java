package enquantoComFlag;

import java.util.Scanner;

public class atividade56 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	int soma= 0;
	int valor=0;
	
	System.out.println("Digite valor");
	while(valor<1111) {
	
	valor = input.nextInt();
	soma+=valor;
	 
	 System.out.println("SOMA "+soma);
	}
	
	
	
	if(valor == 1111) {
		System.out.println("Programa acabou");
	}
	
	
	}

}
