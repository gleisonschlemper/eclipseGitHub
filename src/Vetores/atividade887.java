package Vetores;

import java.util.Scanner;

public class atividade887 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	String nome [] = new String[10];
	int idade [] = new int [10];
	
	for(int i=0; i<nome.length; i++) {
		System.out.println("Informe seu nome");
		nome[i] = input.next();
		
		System.out.println("Informe seu idade");
		idade[i] = input.nextInt();
	}
	
	for(int i=0; i<nome.length; i++) {
		if(idade[i] < 18) {
			System.out.println("Nome: "+nome[i]+" \n"
					+ "Idade:"+idade[i]);
		}
	}
	
	
	}

}
