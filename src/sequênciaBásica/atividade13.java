package sequ�nciaB�sica;

import java.util.Scanner;

public class atividade13 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("sal�rio de funcion�rio \n");
	
	System.out.println("Digite sal�rio");
	double salario = input.nextDouble();
	
	double reajuste = salario * 0.15;
	salario = salario + reajuste;
	
	System.out.println("reajuste sal�rial de 15%: "+salario);
	}

}
