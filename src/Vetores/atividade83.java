package Vetores;

import java.util.Scanner;

public class atividade83 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int array [] = new int [10];
	// TODO Auto-generated method stub
	int media =0;
	int maior =0;
	int position =0;
	int quant  = 0;	
	int acimaDaMedia =0;
	int i=0;
	while(i<array.length) {
		System.out.println("Informe sua nota");
		int nota = input.nextInt();
		
		if(nota >= 0 && nota <=10) {
			array[i] = nota;
			media+=array[i];
			quant++;;
			if(i == 0) {
				maior = array[i];
				position = i;
			}
		
			else if(array[i] > maior){
				maior = array[i];
				position = i;
			}
			 i++; 
		}	
		else {
			System.out.println("nota não existente");
		}
		
	}
	
	media = media/quant;
	
	for(i=0;i<array.length;i++) {
		if(array[i] > media) {
			acimaDaMedia++;
		}
	}
	
	System.out.println("Aluno acima da media: "+acimaDaMedia);
	System.out.println("Media da turma: "+media);
	System.out.println("Maior nota "+maior+" posição "+position);
	}

}
