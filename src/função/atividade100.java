package função;

import java.util.Scanner;

public class atividade100 {

	public static int superSomador(int a, int b) {
		int valor=0;
		for(int i=a; i<=b; i++) {
			valor+=i;
		}
		return valor;
	}
	/*
	  Crie um programa que tenha uma função SuperSomador(), que vai receber dois
	  números como parâmetro e depois vai retornar a soma de todos os valores no
	  intervalo entre os valores recebidos.
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o inicio");
	int inicio = input.nextInt();
	
	System.out.println("Digite o final");
	int fim = input.nextInt();
	
	System.out.println(superSomador(inicio,fim)); 
  
	
	}

}
