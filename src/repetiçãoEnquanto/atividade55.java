package repetiçãoEnquanto;

import java.util.Random;
import java.util.Scanner;

public class atividade55 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	Random random = new Random();
	
	int valor = random.nextInt(10);
	int i = 1;
	
	while(i<=4) {
		System.out.println("Digite seu valor:");
		int numero = input.nextInt();
		
		if(valor == numero) {
			System.out.println("Acertou");
		}
		else {
			System.out.println("Errou");
		}
		i++;
	}
	
	
	}

}
