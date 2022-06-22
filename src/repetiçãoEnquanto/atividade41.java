package repetiçãoEnquanto;

import java.util.Scanner;

public class atividade41 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	System.out.println("Saiba a contagem até esse valoro valores "
			+ "\n Digite um valor");
	int valor = input.nextInt();
	
	for(int i=1;i<valor;i++) {
	System.out.print(i+" ");
	}
	
	}

}
