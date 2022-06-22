package condiçõesBásica;

import java.util.Scanner;

public class atividade24 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
 
	System.out.println("Digite a primeira reta");
	double reta1 = input.nextDouble();
	
	System.out.println("Digite a segunda reta");
	double reta2 = input.nextDouble();
	
	System.out.println("Digite a terceira reta");
	double reta3 = input.nextDouble();
	
	if(reta1 > reta2 && reta1 > reta3) {
		double bc = reta2 + reta3;
			if(reta1 < bc ) {
				System.out.println("Dá de formar uma reta \n");
			}
			else {
				System.out.println("NÃO FORMOU UMA RETA \n");
			}
	}
	
	else if(reta2 > reta1 && reta2 > reta3) {
		double ac = reta1 + reta3;
			if(reta2 < ac) {
				System.out.println("Dá de formar uma reta \n");
			}	
			else {
				System.out.println("NÃO FORMOU UMA RETA \n");
			}
	}
	
	else if(reta3 > reta1 && reta3 > reta2) {
		double ab = reta1 + reta2;
			if(reta3 < ab) {
				System.out.println("Dá de formar uma reta \n");
			}	
		else {
				System.out.println("NÃO FORMOU UMA RETA \n");
			}
	}
	
	
	
	
	}

}
