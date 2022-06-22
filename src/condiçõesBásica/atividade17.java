package condiçõesBásica;

import java.util.Scanner;

public class atividade17 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite a velocidade do carro");
	double velocidade = input.nextInt();
	
	if(velocidade > 80) {
	velocidade = velocidade - 80;
    double pagar = velocidade * 5;
    
    System.out.println("Valor a ser pago "+pagar+" R$");
	}
	
	
	
	}

}
