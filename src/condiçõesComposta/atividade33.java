package condiçõesComposta;

import java.util.Scanner;

public class atividade33 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite sua altura");
	double altura = input.nextDouble();
	
	System.out.println("Digite seu peso");
	double peso = input.nextDouble();
	
	double imc = peso / (Math.pow(altura, 2) ) ;

	if(imc > 0 && imc < 18.5) {
		System.out.println("Abaixo do peso");
	}
	
	else if(imc >= 18.5 && imc <= 24.9) {
		System.out.println("saldável");
	}
		
	else if(imc >= 25.0 && imc < 29.9) {
		System.out.println("Sobre Peso");
	}
	
	else if(imc >= 30.0 && imc <= 34.9) {
		System.out.println("Obesidade 1");
	}
	
	else if(imc >= 35.0 && imc <= 39.9) {
		System.out.println("Obesidade 2");
	}
	
	else {
		System.out.println("Obesidade 3");
	}
	
		
		
		
	}

}
