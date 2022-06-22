package condiçõesComposta;

import java.util.Scanner;

public class atividade30 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
	System.out.println("Pedra = 0 ");
	System.out.println("Papel = 1  ");
	System.out.println("Tesoura = 2 \n");
	
	System.out.println("Jogar 1");
	int jogador1 = input.nextInt();
		
	System.out.println("Jogar 2");
	int jogador2 = input.nextInt();

	switch (jogador1) //switch "CASO"
	{
		case 0:
	//Paguei valor 
			switch (jogador2) {
				case 0:
					System.out.println("Empate");
				case 1:
					System.out.println("Venceu");
				case 2:
					System.out.println("Perdeu");
			}
	} 
	
	switch (jogador1) //switch "CASO"
	{
		case 1: //Paguei valor 
			switch (jogador2) {
				case 0:
					System.out.println("Venceu");
				case 1:
					System.out.println("Empate");
				case 2:
					System.out.println("Perdeu");
			}
	} 
	
	switch (jogador1) //switch "CASO"
	{
		case 2: //Paguei valor 	
			switch (jogador2) {
				case 0:
					System.out.println("Perdeu");
				case 1:
					System.out.println("Venceu");
				case 2:
					System.out.println("Empate");
			}
	} 
	
	
	
	
	
	
	
	
	
	}

}
