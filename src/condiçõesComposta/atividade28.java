package condi��esComposta;

import java.util.Scanner;

public class atividade28 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite seu nome");
	String nome = input.next();
	
	System.out.println("Tempo de trabalho em anos");
	double tempo = input.nextDouble();
	
	System.out.println("Digite seu sal�rio");
	double salario = input.nextDouble();
	
	if(tempo > 0 && tempo <= 3) {
		if(salario > 0) {
			System.out.println("Aumento de 3%");
			double aumento =  salario * 0.03;
			salario = salario + aumento;
			System.out.println("Novo sal�rio "+salario);		
		}
		
		else {
			System.out.println("salario n�o exite");
		}
		
	}
	
	
	else if(tempo > 3 && tempo < 10) {
		
		if(salario >= 0) {
			System.out.println("Aumento de 12.5%");
			double aumento =  salario * 0.125;
			salario = salario + aumento;
			System.out.println("Novo sal�rio "+salario);
		}
		
		else {
			System.out.println("salario n�o exite");
		}
		
	}
	
	else if(tempo < 0) {
		System.out.println("Valor n�o existente");
	}
	
	else {
		if(salario > 0) {
			System.out.println("Aumento de 20%");
			double aumento =  salario * 0.20;
			salario = salario + aumento;
			System.out.println("Novo sal�rio "+salario);
		}
		
		else {
			System.out.println("salario n�o exite");
		}
		 
	}
	
	 
	
	
	}

}
