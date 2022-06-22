package primo;

import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	
	
	for(int i=1;i<=10;i++) {
	System.out.println("Digite um valor");
	int primo = input.nextInt();	
	int valor =0;
	for(int j=1;j<=primo;j++) {
		if((primo % j)==0) {
			valor++;
		}
	}
	
	if(valor == 2) {
		System.out.println("Valor é primo");
	}
	
	else {
		System.out.println("Valor não primo");
	}
	
	}
	
	}

}
