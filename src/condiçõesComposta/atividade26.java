package condiçõesComposta;

import java.util.Scanner;

public class atividade26 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite a primeria nota");
	double primeria = input.nextDouble();
	
	System.out.println("Digite a segunda nota");
	double segunda = input.nextDouble();
	
	double media = (primeria + segunda)/2;
	
	if(media > 0 && media <= 4.9) {
		System.out.println("Reprovado");
	}
	
	else if(media >= 5.0 && media < 6.9) {
		System.out.println("Recuperação");
	}
	
	else if(media >= 7.0 && media <= 10.0) {
		System.out.println("Aprovado");
	}
	
	else {
		System.out.println("Esse valor não existe");
	}
	
	
	}
}


