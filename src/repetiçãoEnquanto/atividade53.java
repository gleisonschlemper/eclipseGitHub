package repetiçãoEnquanto;

import java.util.Scanner;

public class atividade53 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    int masculino = 0;
    int feminino=0;
    int mediaIdade=0;
    int mediaMasculino=0;
    int maiorDe20 = 0;
    
	for(int i=1;i<=5;i++) {
	System.out.println("Digite sua idade");
	int idade = input.nextInt();
	
	System.out.println("Digite seu sexo");
	String sexo = input.next();
	
	if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino")) {
	masculino++;
	mediaMasculino+=idade;
	mediaIdade+=idade;
	}
	
	else if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino")) {
		feminino++;
		mediaIdade+=idade;
		if(idade > 20) {
			maiorDe20++;
		}
	}
	
	}
	System.out.println("Homens cadastrados:"+masculino);
	System.out.println("Mulheres cadastrados:"+feminino);
	
	System.out.println("Media de idade: "+mediaIdade/5);
	
	System.out.println("Média de idade de homens: "+mediaMasculino/masculino);
	
	System.out.println("Mulheres acima de 20 anos: "+maiorDe20);
	}

}
