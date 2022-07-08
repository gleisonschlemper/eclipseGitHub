package Vetores;

import java.util.Scanner;

public class atividade888 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int quantFuncionario = 3;
	
	
	String nome[] = new String[quantFuncionario];
	String  sexo[] = new String [quantFuncionario];
	int salario[] = new int [quantFuncionario];
	
	
	for(int i=0 ;i<nome.length; i++) {
		System.out.println("Informe seu nome");
		nome[i] = input.next();
		
		System.out.println("Informe seu sexo \n"
				+ "Masculino ou Feminino\n"
				+ "m ou f");
		sexo[i] = input.next();
		
		System.out.println("Informe seu salário");
		salario[i] = input.nextInt();
	}

	for(int i=0 ;i<nome.length; i++) {
		if(sexo[i].equalsIgnoreCase("Feminino") ||
		   sexo[i].equalsIgnoreCase("f") && salario[i] > 5000) {
			System.out.println(
					  "nome: "+nome[i]+"\n"
					+ "sexo: "+sexo[i]+"\n"
					+ "salário: "+salario[i]);
		}
	}
	
	}

}
