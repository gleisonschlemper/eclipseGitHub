package condi��esComposta;

import java.util.Scanner;

public class atividade36 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite hora de atividade f�sica no m�s");
	int mes = input.nextInt();
	
	if(mes > 0 && mes < 10) {
		double ponto = mes * 2;
		double dinheiro = ponto * 0.05;
		System.out.println("Dinheiro pela atividade f�sica"+dinheiro);
	}
	
	else if(mes >= 10 && mes <= 20) {
		int ponto = mes * 5;
		double dinheiro = ponto * 0.05;
		System.out.println("Dinheiro pela atividade f�sica "+dinheiro);
	}
	
	else if(mes > 20) {
		int ponto = mes * 10;
		double dinheiro = ponto * 0.05;
		System.out.println("Dinheiro pela atividade f�sica "+dinheiro);
	}
	else {
		System.out.println("N�o receber� nada");
	}
	
	
	
	}

}
