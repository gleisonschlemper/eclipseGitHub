package procedimentos;

import java.util.Scanner;

public class atividade90 {
	
	
	static void gerador(String e, int quant) {
			for(int i=0;i<quant; i++) {
				System.out.println(   e  );
			}
		

		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tipo de borda");
		String borda = input.next();
		
		
		System.out.println("Quantidade de repetição \n"
				+ "Olá mundo:");
		int repeticao = input.nextInt();
		
		if(borda.equalsIgnoreCase("borda1")) {
			
			System.out.println("+------======-----+ ");
			gerador("     Olá mundo", repeticao);
			System.out.println("+------======-----+ ");
			
		}
		else if(borda.equalsIgnoreCase("borda2")){
			
			System.out.println("~~~~~~~~:::::::~~~~~~~");
			gerador("     Olá mundo", repeticao);
			System.out.println("~~~~~~~~:::::::~~~~~~~");
			
		}
		
		else if(borda.equalsIgnoreCase("borda3")){
			System.out.println("<<<<<<<<------->>>>>>>");
			gerador("     Olá mundo", repeticao);
			System.out.println("<<<<<<<<------->>>>>>>");
		}

		
	}

}
