package repetiçãoEnquanto;

import java.util.Scanner;

public class atividade44 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite o primeiro valor");
	int primeiro = input.nextInt();
	
	System.out.println("Digite último valor");
	int ultimo = input.nextInt();
	
	System.out.println("Digite o incremento"); 
	int incremento = input.nextInt();
	
	for(int i = primeiro; i<=ultimo; i=i+incremento) {
		System.out.print(i+" ");
	}
	}

}
