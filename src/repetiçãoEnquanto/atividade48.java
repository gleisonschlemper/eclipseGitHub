package repetiçãoEnquanto;

import java.util.Scanner;

public class atividade48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int soma =0;
		int contagem=0;
		for(int i=1;i<=8;i++) {
		System.out.println("Digite valor de "+i);
		int valor = input.nextInt();
		soma+=valor;
		
		contagem = i;
		}
		System.out.println("Soma dos "+contagem +" deu: "+soma);
	}

}
