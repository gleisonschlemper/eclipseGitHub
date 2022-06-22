package enquantoComFlag;

import java.util.Scanner;

public class atividade59 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub

	String continuar = "sim";
	int homens = 0;
	int maior = 0;
	int idadeMenorF = 0; 
	int maiorIdadeF = 0;
	int menorIdadeF = 0;
	int mediaIdadeM = 0;
	
	while(continuar.equalsIgnoreCase("sim")) 
	{
		System.out.println("Digite seu sexo");
		String sexo = input.next();
		
		if(sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) 
		{
			
				System.out.println("Digite sua idade");
				int idadeHomem = input.nextInt();
				
				if(idadeHomem > maior) 
				{
					homens++;
					maior = idadeHomem;
					mediaIdadeM = idadeHomem;
				}
			
		}
		
		//Parte dos homens
		
		else if (sexo.equalsIgnoreCase("feminino") ||
				 sexo.equalsIgnoreCase("f")) 
		{
			
			System.out.println("Digite sua idade");
			int idadeMulher = input.nextInt();
		
			
			if(idadeMulher > maior) 
			{
				maior = idadeMulher;
			}
			
			for(int i=0;i<=idadeMulher;i++) 
			{
				if(i==0) 
				{		
					maiorIdadeF = idadeMulher;
					menorIdadeF = idadeMulher;
				}
				
				else if(idadeMulher > maiorIdadeF) 
				{
					maiorIdadeF = idadeMulher;
				}
				
				else if(idadeMulher < menorIdadeF) 
				{
					menorIdadeF= idadeMulher;
				}
				
			}
			
		}
		//Parte das mulheres
		
		System.out.println("Deseja continuar");
		continuar = input.next();
		
		}
	
		double mediaM = mediaIdadeM/homens;
	
		System.out.println("Maior idade lida: "+maior);
		System.out.println("Mulher mais jovem: "+menorIdadeF);
		System.out.println("Homens cadastrado: "+homens);
		System.out.println("Media de homens: "+mediaM);
		
	}
	
	
	}


