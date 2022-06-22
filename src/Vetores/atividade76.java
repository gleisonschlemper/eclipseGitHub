package Vetores;

import java.util.Random;

public class atividade76 {

	public static void main(String[] args) {
		Random gerador = new Random(); 
		// TODO Auto-generated method stub
		int array [] = new int [7];
		
		for(int i=0; i<array.length;i++) {
			 array[i] = gerador.nextInt(100);
			System.out.println(array[i]+" na posição: "+i);
			
			
		}
		
	}

}
