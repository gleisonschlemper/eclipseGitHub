package repeti��oEnquanto;

import java.util.Scanner;

public class atividade45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.println("Digite o primeiro valor");
		int primeiro = input.nextInt();
		
		System.out.println("Digite �ltimo valor");
		int ultimo = input.nextInt();
		
		System.out.println("Digite o incremento"); 
		int incremento = input.nextInt();
		
		if(ultimo > primeiro) {
		for(int i = primeiro; i<=ultimo; i=i+incremento) {
			System.out.print(i+" ");
		}
		}
		else {
			System.out.println("�ltimo n�o pode ser menor que o primeiro");
		}
		
		}
		
	}


