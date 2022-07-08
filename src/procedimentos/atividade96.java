package procedimentos;

import java.util.Scanner;

public class atividade96 {
	
	static void fibonacci(int e) {
		int a=0;
		int b=1;
		int fibonacci=1;
		for(int i=0;i<e;i++) {
			System.out.println(fibonacci);
			fibonacci = a + b;
			a = b;
			b = fibonacci;
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Quantidade fibonacci");
		int valor = input.nextInt();
		
		 fibonacci(valor);
		
	}

}
