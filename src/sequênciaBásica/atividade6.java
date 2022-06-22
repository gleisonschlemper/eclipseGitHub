package sequênciaBásica;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Antecessor e seu sucessor. \n");
	System.out.println("Digite um valor");
	int numero = input.nextInt();
	
	int sucessor = numero + 1;
	System.out.println("sucessor: "+sucessor);
	
	int Antecessor = numero - 1;
	System.out.println("Antecessor: "+Antecessor);
	
	
	
	
	}

}
