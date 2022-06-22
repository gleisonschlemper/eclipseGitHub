package repetiçãoPara;

import java.util.Scanner;

public class atividadePara2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	int MaioresPeso = 0;
	int media =0;
	int quantMulheres = 0;
	String nomeMaior = "" ;
	double maior = 0;
	double menor = 0;
	
	
	for(int i=0;i<8;i++) {
		System.out.println("Digite seu nome");
		String nome = input.next();
		
		System.out.println("Informe seu sexo");
		String sexo = input.next();
		
		if(sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
			
			System.out.println("Digite seu peso");
			double peso = input.nextDouble();
				if(peso > 100.00) {
					MaioresPeso++;
				}
				
				if(i == 0) {
					maior = peso;
					menor = peso;
					nomeMaior = nome;
				}
				
				else if(peso > maior) {
					maior = peso;
					nomeMaior = nome;
				}
				
				else if(peso < menor) {
					menor = peso;
				}	
				
		}
		
		else if(sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("f")) {
			quantMulheres++;
			System.out.println("Digite seu peso");
			double peso = input.nextDouble();
			media+= peso;
		}
		
		
		}
	media = media/quantMulheres;
	
	System.out.println("Quantidade de homens mais de 100 Kg "+MaioresPeso);
	System.out.println("Quantidades de cadastros de mulheres "+quantMulheres);
	System.out.println("Media de peso das mulheres "+media);
	System.out.println("Maior peso entre os homens é do "+nomeMaior+" com peso de "+maior);
	
	}

}
