package Vetores;

import java.util.Scanner;

public class atividade77 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		String[] array = new String [7];
		String[] reverse = new String [7];
		int i;
		
		for(i=0; i<array.length ; i++) {
			System.out.println("Digite nome");
			array[i] = input.next();
		}
		//pego os 7 valores come�ando do zero 
		
		for(i=6; i>=0; i--) {
			System.out.println(array[i]);
			
		}
		// come�o do 6 at� o zero contando; 7 valores
		
		
		
	}

}
