package repetiçãoEnquanto;

import java.util.Scanner;

public class atividade54 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	int pesoAcima90 = 0;
	int pesoMenos50Menos160 =0;
	int pesoMais100Mais190=0;
	double mediaAltura=0;
	
	for(int i=1;i<=3;i++) {
		System.out.println("Digite altura: ");
		double altura = input.nextDouble();
		
		System.out.println("Digite peso");
		double peso = input.nextDouble();
		
		
		if(peso < 50 && altura < 1.60 && altura > 0) {
			pesoMenos50Menos160++;
			mediaAltura+=altura;
			
		}
		else if(peso > 100 && altura > 1.90 && altura > 0) {
			pesoMais100Mais190++;
			mediaAltura+=altura;
			
		}
		
		else if(peso > 50 && altura > 0) {
			pesoAcima90++;
			mediaAltura+=altura;
		}
		
	}
	
	System.out.println("Média de altura do grupo: "+mediaAltura/3);
	
	System.out.println("Pessoas pesam mais de 90Kg: "+pesoAcima90);
	
	System.out.println("pessoas que pesam menos de 50Kg tem menos de 1.60m: "+pesoMenos50Menos160);
	
	System.out.println("pessoas que medem mais de 1.90m pesam mais de 100Kg: \r\n"
			+pesoMais100Mais190);
	}

}
