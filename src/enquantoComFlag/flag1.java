package enquantoComFlag;

import java.util.Scanner;

public class flag1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    // TODO Auto-generated method stub
		
	System.out.println("Informe a idade");	
	int idade = input.nextInt();
	
	while(idade>0) {
		
		System.out.println("idade: "+idade);
		System.out.println("Informe a idade");
		idade = input.nextInt();
		
	}
	if(idade < 0) {
		System.out.println("Programa cancelado");
	}
	}

}
