package repetiçãoEnquanto;

import java.util.Scanner;

public class atividade52 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	int media = 0;
	int maior = 0;
	int maior18 = 0;
	int menor5 = 0;
	
	for(int i=1;i<=3;i++) {
		System.out.println("Digite sua idade");
		int idade = input.nextInt();
		
		if(i==1 && idade > 18  ) {
			maior = idade;
			maior18++;
			media+= idade;
		}
		else if(i==1 && idade < 5) {
			maior = idade;
			menor5++;
			media+= idade;
		}
		
		else if(idade > maior) {
			maior = idade;
		}
		
		else if(idade > 18) {
			maior18++;
			media+= idade;
		}
		else if(idade < 5) {
			menor5++;
			media+= idade;
		}
		
	}
	System.out.println("Maior que 18: "+maior18);
	System.out.println("Menor que 5: "+menor5);
	System.out.println("Media: "+media/3);
	System.out.println("Maior idade: "+maior);
	
	}

}
