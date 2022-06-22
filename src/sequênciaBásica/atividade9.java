package sequênciaBásica;

import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Dinheiro reais em dolar \n");
	System.out.println("Dinheiro na carteira");
	double reais = input.nextDouble();
	
	double dolar = reais/3.45;
	
	System.out.println(dolar+" em dolar");
	
	}

}
