package condiçõesBásica;

import java.util.Scanner;

public class atividade23 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite seu nome");
	String nome = input.next();
	
	System.out.println("Digite seu sexo \n M = masculino ou F = feminino");
	String sexo = input.next();
	
	if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino") ) {
		System.out.println("terá desconto de 13% \n");
		System.out.println("Digite o valor da compra");
		double compra = input.nextDouble();
		
	    double desconto = compra * 0.13;
	    compra = compra - desconto;
	    System.out.println("Sra "+nome+" terá valor de "+compra);
	}
	
	else if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino") ) {
		System.out.println("terá desconto de 5% \n");
		System.out.println("Digite o valor da compra");
		double compra = input.nextDouble();
		
	    double desconto = compra * 0.05;
	    compra = compra - desconto;
	    System.out.println("Sr "+nome+" terá valor de "+compra+" com desconto");	
	}
	else {
		System.out.println("Sexo inválido");
	}
	
	
	}

}
