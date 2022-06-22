package condiçõesComposta;

import java.util.Scanner;

public class atyvydade35 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	System.out.println("Digite o tipo de carro \n"
			+ "Carro popular ou de luxo");
	
    String tipo = input.next();
   
    //PARTE DO CARRO POPULAR 
    
	if(tipo.equalsIgnoreCase("popular")) {
		System.out.println("aluguel de R$90 por dia \n");
		
		System.out.println("Digite o(s) dia(s) com veiculo ");
		
		int dia = input.nextInt();
		
		System.out.println("quantos km percorrido");
		double km = input.nextInt();
		
		if(km > 0 && km <= 100) {
			double preco = km * 0.20;
			double diaPreco = dia * 90;
			
			double pagarAutomovel = diaPreco + preco;
			System.out.println("Vai pagar o aluguel do automovel "+pagarAutomovel+" R$ pelos ");
		}
		
		else if(km > 100) {
			double preco = km * 0.10;
			double diaPreco = dia * 90;
			double pagarAutomovel = diaPreco + preco;
			System.out.println("Vai pagar o aluguel do automovel "+pagarAutomovel+" R$ pelos ");
		}
		
		else {
			
			System.out.println("Km não existente");
		}
		
		
		
	}
	
	//FIM DO CARRO POPULAR 
	
	//PARTE DO CARRO DE LUXO
	
	else if(tipo.equalsIgnoreCase("luxo")) {
		System.out.println("aluguel de R$150 por dia \n");
	
		System.out.println("Digite o(s) dia(s) com veiculo ");
		
		int dia = input.nextInt();
		
		System.out.println("quantos km percorrido");
		double km = input.nextInt();
		
		if(km > 0 && km <= 200) {
			double preco = km * 0.30;
			double diaPreco = dia * 150;
			
			double pagarAutomovel = diaPreco + preco;
			System.out.println("Vai pagar o aluguel do automovel "+pagarAutomovel+" R$ pelos ");
		}
		
		else if(km > 200) {
			double preco = km * 0.25;
			double diaPreco = dia * 150;
			double pagarAutomovel = diaPreco + preco;
			System.out.println("Vai pagar o aluguel do automovel "+pagarAutomovel+" R$ pelos ");
		}
		
		else {
			
			System.out.println("Km não existente");
		}
		
		
	}
	//FIM DO CARRO DE LUXO
	
	else {
		System.out.println("NÃO EXISTE ESSE CARRO");
	}
	
	}

}
