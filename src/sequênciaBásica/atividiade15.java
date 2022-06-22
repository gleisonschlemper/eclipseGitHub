package sequênciaBásica;

import java.util.Scanner;

public class atividiade15 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	// TODO Auto-generated method stub
    System.out.println("Dias trabalhado");
    int dias = input.nextInt();
    
    System.out.println("Tempo trabalhado por dia");
    int tempo = input.nextInt();
	
    System.out.println("Ganha quanto por hora");
    int hora = input.nextInt();
	
	int salario = (tempo * hora) * dias;
	System.out.println("Salário: "+salario);
	
	
	}

}
