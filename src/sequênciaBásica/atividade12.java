package sequ�nciaB�sica;

import java.util.Scanner;

public class atividade12 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Compre seu produto com 5% de desconto \n");
    
    System.out.println("Pre�o do produto");
    double produto = input.nextDouble();
    double desconto = produto * 0.05;
    produto = produto - desconto;
    System.out.println("pre�o do produto com desconto: "+produto);
	}

}
