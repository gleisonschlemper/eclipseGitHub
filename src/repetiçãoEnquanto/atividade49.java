package repetiçãoEnquanto;

import java.util.Scanner;

public class atividade49 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	int pares=0;
	int impares=0;
	
	for(int i=1;i<=6;i++) {
	System.out.println("Digite valor");
	int valor = input.nextInt();
		if((valor%2)==0) {
			pares++;
		}
		else {
			impares++;
		}
	}
	
	System.out.println("Número de pares: "+pares);
	System.out.println("Número de impares: "+impares);
	
	}

}
