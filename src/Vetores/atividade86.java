package Vetores;

import java.util.Scanner;

public class atividade86 {

	public static void main(String[] args) {
	String nomes [] = new String [9];
	int idades [] = new int [9];
	Scanner input = new Scanner(System.in);


	for(int i=0; i<nomes.length; i++) {
		System.out.println("Digite seu nome");
		nomes[i] = input.next();
		
		System.out.println("Digite sua idade");
		idades[i] = input.nextInt();
	}
	
	for(int i=0; i<nomes.length; i++) {
		System.out.println("Nome "+nomes[i]+" com idade: "+idades[i]);

	}
	
	
	}

}
