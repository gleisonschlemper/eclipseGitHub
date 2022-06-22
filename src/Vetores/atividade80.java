package Vetores;

import java.util.Scanner;

public class atividade80 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array [] = new int [15];
		// TODO Auto-generated method stub
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Informe um valor");
			array[i] = input.nextInt();
		}
		
		for(int i=0; i<array.length; i++) {
			if((array[i] % 2)==0) {
				System.out.println("são pares: "
						+array[i]+" na posição "+i);
			}
		}

	}

}
