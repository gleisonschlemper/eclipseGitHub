package condi��esComposta;

import java.util.Scanner;

public class atividade37 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite sal�rio");
	double salario = input.nextDouble();
	
	System.out.println("Funcionaria \n "
			+ "m ou f"); 
	String sexo = input.next();
	
	if(sexo.equalsIgnoreCase("f")) {
		System.out.println("Tempo de empresa");
		int tempo = input.nextInt();
		
		if(tempo > 0 && tempo < 15) {
		double novoSalario = salario * 0.05;
		salario = novoSalario + salario;
		System.out.println(salario );
		}
		
		else if(tempo >= 15 && tempo < 20) {
			double novoSalario = salario * 0.12;
			salario = novoSalario + salario;
			System.out.println(salario );
		}
		
		else if(tempo >= 20) {
			double novoSalario = salario * 0.23;
			salario = novoSalario + salario;
			System.out.println(salario );
		}
		
		else {
			System.out.println("Tempo n�o existe");
		}
		
	}
	
	// Parte do feminino
	
	if(sexo.equalsIgnoreCase("m")) {
		System.out.println("Tempo de empresa");
		int tempo = input.nextInt();
		
		if(tempo > 0 && tempo < 15) {
		double novoSalario = salario * 0.03;
		salario = novoSalario + salario;
		System.out.println(salario );
		}
		
		else if(tempo >= 15 && tempo < 20) {
			double novoSalario = salario * 0.13;
			salario = novoSalario + salario;
			System.out.println(salario );
		}
		
		else if(tempo >= 20) {
			double novoSalario = salario * 0.25;
			salario = novoSalario + salario;
			System.out.println(salario );
		}
		
		else {
			System.out.println("Tempo n�o existe");
		}
		
	}
	//parte masculino
	
	else {
		System.out.println("Sexo n�o existente");
	}
	
	
	
	}

}
