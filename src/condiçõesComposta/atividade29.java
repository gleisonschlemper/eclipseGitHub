package condiçõesComposta;

import java.util.Scanner;

public class atividade29 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite a primeira reta");
	double reta1 = input.nextDouble();
	
	System.out.println("Digite a segunda reta");
	double reta2 = input.nextDouble();
	
	System.out.println("Digite a terceira reta");
	double reta3 = input.nextDouble();
	
	
	if(reta1 == reta2 && reta1 != reta3 || 
	reta3 == reta2 && reta3 != reta1 ||
	reta3 == reta1 && reta3 != reta2 ) {
		System.out.println("EQUILÁTERO:");
	}
	
	
	else if(reta1 == reta2 && reta2 == reta3 ){
		System.out.println("ISÓSCELES:");
	}
		
	else {
		System.out.println("ESCALENO");
	}
	
	
	
	}
}
