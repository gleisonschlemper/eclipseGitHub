package Vetores;

import java.util.Random;
import java.util.Scanner;

public class atividade81 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int array [] = new int [30];
	Random gerador = new Random();
	// TODO Auto-generated method stub
	
	for(int i=0; i<array.length; i++) {
		array[i] = gerador.nextInt(15);
	}
	//gerei 15 valores aleátorio até 15
	int valor =0;
	
	System.out.println("Dgite um valor chave");
	int chave = input.nextInt();
	//peguei um valor chave

	for(int i=0; i<array.length; i++) {
		if(chave == array[i]) {
			valor++;
		}
		
	}
	System.err.println("Acerto "+valor);
	
	}
//aqui comparo o valor chave, se é igual ao valor gerado; se sim falo a quantidade.
}
