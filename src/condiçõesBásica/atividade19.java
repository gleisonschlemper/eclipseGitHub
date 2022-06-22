package condiçõesBásica;

import java.util.Scanner;

public class atividade19 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    
	System.out.println("Nome do aluno");
	String nome = input.next();
	
	System.out.println("Digite nota 1");
	double nota1 = input.nextDouble();
	
	System.out.println("Digite nota 2");
	double nota2 = input.nextDouble();
	
	double media = (nota1 + nota2)/2;
	
	if(media > 7) {
		System.out.println(nome+" Teve bom aproveitamento, com media "+media);
	}
	
	else {
		System.out.println(nome+" Teve péssimo aproveitamento, com media "+media);
	}
	
	}

}
