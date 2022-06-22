package condiçõesComposta;

import java.util.Scanner;

public class atividade36 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite hora de atividade física no mês");
	int mes = input.nextInt();
	
	if(mes > 0 && mes < 10) {
		double ponto = mes * 2;
		double dinheiro = ponto * 0.05;
		System.out.println("Dinheiro pela atividade física"+dinheiro);
	}
	
	else if(mes >= 10 && mes <= 20) {
		int ponto = mes * 5;
		double dinheiro = ponto * 0.05;
		System.out.println("Dinheiro pela atividade física "+dinheiro);
	}
	
	else if(mes > 20) {
		int ponto = mes * 10;
		double dinheiro = ponto * 0.05;
		System.out.println("Dinheiro pela atividade física "+dinheiro);
	}
	else {
		System.out.println("Não receberá nada");
	}
	
	
	
	}

}
