package Vetores;

import java.util.Scanner;

public class atividade79 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array [] = new int [15];
		// TODO Auto-generated method stub
		
		for(int i=0; i<array.length; i++) {
			array[i] = input.nextInt();
		}
		
		for(int i=0; i<array.length; i++) {
			if((array[i] % 10)==0) {
				System.out.println("Multiplo por 10: \n"
						+array[i]+" na posição "+i);
			}
		}

	}

}
