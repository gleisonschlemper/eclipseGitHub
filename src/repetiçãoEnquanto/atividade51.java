package repetiçãoEnquanto;

import java.util.Scanner;

public class atividade51 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	
	double maior =0;
	double menor = 0;
	
	for(int i =1;i<=8;i++) {
	System.out.println("Digite valor do produto");	
	double produtos = input.nextDouble();
	
	if(i==1) {
	maior = produtos;
	menor = produtos;
	}
	else if(produtos > maior) {
		maior = produtos;
	}
	else if(produtos < menor) {
		menor = produtos;
	}
		
	}
	System.out.println("Maior valor: "+maior);
	System.out.println("Menor valor: "+menor);
	
	
	
	}

}
