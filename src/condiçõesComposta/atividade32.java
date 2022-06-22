package condiçõesComposta;

import java.util.Scanner;

public class atividade32 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	/*
	  
	 
	 DESCOBRI SE CONCEGUI EMPRESTIMO OU NÃO 
	 
	  
	 */
	
	// TODO Auto-generated method stub

	System.out.println("Digite valor do empréstimo");
	double emprestimo = input.nextDouble();
	
	System.out.println("Digite o tempo que vai pagar em anos");
	int tempo = input.nextInt();
	
	double prestacao = emprestimo/(tempo * 365);
	//descubro o valor do emprestimo dividido pelo tempo em anos
	
	System.out.println("Digite seu salário");
	double salario = input.nextDouble();
	salario = salario * 0.30;
	
	if(salario > prestacao) {
		System.out.println(" empréstimo concedido \n "
				+ "pagará por mês "+prestacao);
	}
	else {
		System.out.println(" empréstimo negado");
	}
	
	
	}

}
