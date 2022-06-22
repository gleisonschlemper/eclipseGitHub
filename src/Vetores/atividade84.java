package Vetores;

import java.util.Random;
import java.util.Scanner;

public class atividade84 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int array [] = new int [20];
	Random gerador = new Random();
	// TODO Auto-generated method stub
	
	for(int i=0; i<array.length; i++) {
		array[i] = gerador.nextInt(100);
		System.out.println(array[i]);
		
	}
	
	
	}

}
