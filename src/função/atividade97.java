package função;

import java.util.Scanner;

public class atividade97 {
	
	public static int soma(int a,int b) {
		 return a + b;
		
		 
	 }
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int valor1 = input.nextInt();
	int valor2 = input.nextInt();
	
	System.out.println(soma(valor1,valor2));

	
	}

}
