package enquantoComFlag;

import java.util.Scanner;

public class atividade60 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	String nomeMaior = "";
	String result = "sim";
	int mulherMenor18 = 0;
	int homemMaior30 = 0;
	int maior = 0; 
	int menor= 0;
	int media=0;
	int quant=0;
	String nome;
	int i = 0;
	
	while(result.equalsIgnoreCase("sim") && i<=9999) {
		System.out.println("Digite nome");
		nome = input.next();
		
		System.out.println("Digite o sexo");
		String sexo = input.next();
		
		if(sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
			System.out.println("Digite a idade ");
			int idade = input.nextInt();
			media+=idade;
			quant++;
			if(idade > 30) {
				homemMaior30++;
			}
			
			if(i == 0) {
			maior = idade;
			menor = idade;
			nomeMaior = nome;
			}	
			else if(idade > maior) {
				maior = idade;
				nomeMaior = nome;
			}
			else if(idade < menor) {
				menor = idade;
			}
			
			
		}
		
		
		else if(sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("f")) {
			System.out.println("Digite a idade ");
			int idade = input.nextInt();
			media+=idade;
			quant++;
			if(idade < 18) {
				mulherMenor18++;
			}
			
			
			if(i == 0) {
			maior = idade;
			menor = idade;
			nomeMaior = nome;
			}	
			else if(idade > maior) {
				maior = idade;
				nomeMaior = nome;
			}
			else if(idade < menor) {
				menor = idade;
			}	
			
		}
		
		else {
			System.out.println("Sexo invalido");
		}
		
		i++;
		System.out.println("Deseja continuar?");
		result = input.next();
	}
	
	media = media/quant;
	
	
	System.out.println(nomeMaior+" mais velho(a) com "+maior+" anos");
	System.out.println("Mulheres menos de 18 anos "+mulherMenor18);
	System.out.println("Homem maior de 30 anos "+homemMaior30);
	System.out.println("Idade media "+media);
	
	
	}	
			
	}


