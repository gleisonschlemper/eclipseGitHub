package Vetores;

import java.util.Scanner;

public class atividade82 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array [] = new int [8];
	// TODO Auto-generated method stub
		int media = 0;
		int maior =0;
		int mais = 0;
		int position =0;
		int valor =0;
		
		for(int i=0; i<array.length; i++) {
			array[i] = input.nextInt();
			media+= array[i];
			mais++;
			if(array[i] > 25) {
				System.out.println("Mais de 25 na posicição "+i);
			}
			
			if(i == 0 ) {
				maior = array[i];
				position = i;
				valor+= array[i];
			}
			
			else if(array[i] >= maior) {
				maior =  array[i];
				position = i;
				valor+= array[i];
			}
				
		}
		
		int quantidade = valor/maior;
		media = media / mais; 
		System.out.println(" Teve "+quantidade+" valores maiores com valor: "+maior);
		System.out.println("Media: "+media);
		System.out.println(" posição digitamos a maior idade: "+position);
	}

}
