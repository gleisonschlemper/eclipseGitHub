package sequênciaBásica;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Digite nota 1");
	double nota1 = input.nextDouble();
	System.out.println("Digite nota 2");
	double nota2 = input.nextDouble();
	
	double media = (nota1 + nota2) / 2;
	
	System.out.println("media: "+media );
	 
	
	}

}
