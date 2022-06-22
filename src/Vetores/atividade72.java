package Vetores;

import java.util.Scanner;

public class atividade72 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	int vetor[]  = new int [10];
	
	
	for(int i= 0; i<vetor.length;i++) {
		vetor[i] = 5 * (i + 1);
	}
	
	for(int i= 0; i<vetor.length;i++) {
		System.out.println(vetor[i]);
	}
	
	}

}
