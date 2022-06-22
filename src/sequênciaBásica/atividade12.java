package sequênciaBásica;

import java.util.Scanner;

public class atividade12 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Compre seu produto com 5% de desconto \n");
    
    System.out.println("Preço do produto");
    double produto = input.nextDouble();
    double desconto = produto * 0.05;
    produto = produto - desconto;
    System.out.println("preço do produto com desconto: "+produto);
	}

}
