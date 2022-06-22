package sequênciaBásica;

import java.util.Scanner;

public class atividade13 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("salário de funcionário \n");
	
	System.out.println("Digite salário");
	double salario = input.nextDouble();
	
	double reajuste = salario * 0.15;
	salario = salario + reajuste;
	
	System.out.println("reajuste salárial de 15%: "+salario);
	}

}
