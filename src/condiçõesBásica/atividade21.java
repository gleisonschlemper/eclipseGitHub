package condiçõesBásica;

import java.util.Scanner;

public class atividade21 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	
	System.out.println("Saiba se é bissexto \n");
	System.out.println("Digite um valor ");
    int data = input.nextInt();
    
    if((data % 4)==0) {
    	System.out.println("Valor bissexto");
    }
    else {
    	System.out.println("Valor não bissexto");
    }
    
	}

}
