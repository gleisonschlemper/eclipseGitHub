package repetiçãoEnquanto;

import java.util.Random;
import java.util.Scanner;

public class atividade50 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
	
	Random random = new Random();
	System.out.println("numeros sorteados");
	
	int acimaDeCinco=0;
	int divisivel=0;
	
	for(int i=1;i<=20;i++) {
		int valor = random.nextInt(10);
		System.out.print(valor+" ");
		
		if(valor > 5) {
			acimaDeCinco++;
		}
		
		else if((valor % 4)==0) {
			divisivel++;
		}
	
	}
	
	System.out.println("\nNúmeros acima de 5: "+acimaDeCinco);
	System.out.println("Números divisíveis por 3: "+divisivel);
	
	
	
	}

}
