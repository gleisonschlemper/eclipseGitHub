package procedimentos;

import java.util.Scanner;

public class atividade94 {
	static void contador(int a, int b, int c) {
		if(a > b) {
			for(int i=a; i>=b; i = i - c) {
				System.out.println(i);
			}
		}
		else if(b > a){
			for(int i=a; i<=b; i = i + c) {
			System.out.print(i+" >> ");
		}
			
		}
		
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe o inicio");
	int inicio = input.nextInt();
	
	System.out.println("Informe o final");
	int fim = input.nextInt();
	
	System.out.println("Informe encremento");
	int encremento = input.nextInt();
	
	contador(inicio,fim,encremento);
	
	
	}

}
