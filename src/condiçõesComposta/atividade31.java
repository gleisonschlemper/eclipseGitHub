package condi��esComposta;

import java.util.Random;
import java.util.Scanner;

public class atividade31 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
     
	Random gerador = new Random();
     //Gera numero
     gerador.nextInt(26);
     //Imprime valor de 0 at� 25
       
    System.out.println("deseja joga \n "
    		+ "s ou n \n");
    String jogar = input.next();
    
    
    while(jogar.equalsIgnoreCase("s")) {
	  System.out.println("Digite um numero");
	  int numero = input.nextInt();
	  
	  if(numero == gerador.nextInt(6)) {
		  System.out.println("Voc� acertou");
	  }
	  else {
		  System.out.println("Voc� errou \\n");
	  }
	  
	  System.out.println("deseja continuar s ou n \n");
	  jogar = input.next();
	  
	  if(jogar.equalsIgnoreCase("n")) {
		  System.out.println("Jogo acabou");
	  }
	  }
	  
    
    
    }
}


